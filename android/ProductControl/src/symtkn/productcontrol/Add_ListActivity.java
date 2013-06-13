package symtkn.productcontrol;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.apache.http.util.ByteArrayBuffer;

import symtkn.DAO.DAO;
import symtkn.DAO.UrunDAO;
import symtkn.urundenetimi.R;
import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_ListActivity extends Activity {
	Button ekle, listele;
	EditText kod, isim, fiyat, resim;
	private UrunDAO urunDao;
	public final static String EXTRA_MESSAGES = "symtkn.productcontrol";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add__list);
				
		urunDao = new UrunDAO(this);
		ekle = (Button)findViewById(R.id.btnekle);
		listele = (Button)findViewById(R.id.btnList);
		kod = (EditText)findViewById(R.id.editKod);
		isim = (EditText)findViewById(R.id.editAD);
		fiyat = (EditText)findViewById(R.id.editFiyat);
		resim = (EditText)findViewById(R.id.editResim);
		
	    ekle.setOnClickListener(new View.OnClickListener() {
					
		    @Override
			public void onClick(View v) {
		    	try
				{			
		    		urunEkle(kod.getText().toString(), isim.getText().toString(), fiyat.getText().toString(), resim.getText().toString());
				}
				finally
				{
					urunDao.close();
				}
		    }	
	    });
			
	    listele.setOnClickListener(new View.OnClickListener() {
					
				@Override
				public void onClick(View v) {
					try 
					{
						Goster();
					}
					finally
					{
						urunDao.close();
					}
						
				}
				
				
			});
		}
	
	private void urunEkle(String code, String name,
			String price, String imageURL) {
		SQLiteDatabase db = urunDao.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put("kod", code);
		cv.put("ad", name);
		cv.put("fiyat", price);
		
		URL url = null;
		try {
			url = new URL(imageURL);
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		URLConnection ucon = null;
		try {
			ucon = url.openConnection();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		InputStream is = null;
		try {
			is = ucon.getInputStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		BufferedInputStream bis = new BufferedInputStream(is,128);
		ByteArrayBuffer baf = new ByteArrayBuffer(128);
		
		int current = 0;
		try {
			while ((current = bis.read()) != -1) {
			        baf.append((byte) current);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		                          
		cv.put("productImage", baf.toByteArray());
		
		db.insertOrThrow("kullanicilar", null, cv);
		Toast.makeText(this, "Ürün kaydýnýz baþarýyla gerçekleþtirildi!",Toast.LENGTH_LONG).show();
	}
	
	
	private void Goster() {
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_add__list, menu);
		return true;
	}

}
