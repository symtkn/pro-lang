package symtkn.productcontrol;

import java.io.ByteArrayInputStream;

import symtkn.DAO.UrunDAO;
import symtkn.urundenetimi.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class ExtraInformationActivity extends Activity {

	TextView txtName, txtCode, txtPrice;
	QuickContactBadge productImg;
	Integer kodu;
	String urunAdi, fiyati;
	Bitmap theImage;
	
	private UrunDAO urunDao;
	private String [] alanlar = {"kod", "ad", "fiyat", "productImage"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extra_information);
		
		txtName = (TextView) findViewById(R.id.productName);
		txtCode = (TextView) findViewById(R.id.productCode);
		txtPrice = (TextView) findViewById(R.id.productPrice);
		productImg = (QuickContactBadge) findViewById(R.id.imgBadge);
		
		Intent tasiyici = getIntent();
		String ad = tasiyici.getStringExtra(DocumentationActivity.DATA);
		String [] tercih = {ad};
		
		SQLiteDatabase db = urunDao.getReadableDatabase();
		Cursor kayitlar = db.query("urunler", alanlar, "ad=?", tercih, null, null, null);

		while(kayitlar.moveToNext()) {  
	            kodu = kayitlar.getInt(kayitlar.getColumnIndex("kod"));

	            urunAdi = kayitlar.getString(kayitlar.getColumnIndex("ad"));
	
	            fiyati = kayitlar.getString(kayitlar.getColumnIndex("fiyat"));
	
	            byte[] imageByteArray = kayitlar.getBlob(1);
	            kayitlar.close();
	            ByteArrayInputStream imageStream = new ByteArrayInputStream(imageByteArray);
	            theImage = BitmapFactory.decodeStream(imageStream);
	    }
		txtName.setText(urunAdi);
		txtCode.setText(kodu.toString());
		txtPrice.setText(fiyati);
		productImg.setImageBitmap(theImage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_extra_information, menu);
		return true;
	}

}
