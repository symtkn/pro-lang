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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class DocumentationActivity extends Activity {
	public final static String DATA = "urunAD"; 
	ImageButton imgbtn, imgbtn2, imgbtn3, imgbtn4, imgbtn5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_documentation);
		
		imgbtn = (ImageButton) findViewById(R.id.imageButton1);
		imgbtn2 = (ImageButton) findViewById(R.id.imageButton2);
		imgbtn3 = (ImageButton) findViewById(R.id.imageButton3);
		imgbtn4 = (ImageButton) findViewById(R.id.imageButton4);
		imgbtn5 = (ImageButton) findViewById(R.id.imageButton5);
		 
		
		imgbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try 
				{
					sorgula("c");
				}catch(Exception e) {
					System.err.println("Veritabaný baðlantý hatasý!");
				}
			}			
		});
		
		imgbtn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try 
				{
					sorgula("php");
				}catch(Exception e) {
					System.err.println("Veritabaný baðlantý hatasý!");
				}
			}

			
		});
		
		imgbtn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try 
				{
					sorgula("java");
				}catch(Exception e) {
					System.err.println("Veritabaný baðlantý hatasý!");
				}
			}

			
		});
       imgbtn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try 
				{
					sorgula("OOP");
				}catch(Exception e) {
					System.err.println("Veritabaný baðlantý hatasý!");
				}
			}

			
		});
       imgbtn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try 
				{
					sorgula("C#");
				}catch(Exception e) {
					System.err.println("Veritabaný baðlantý hatasý!");
				}
			}

			
		});
		
		
		
	}
	
	
	private void sorgula(String urunAdi) {
		Intent i = new Intent(Intent.ACTION_SEND, null, null, ExtraInformationActivity.class) ;
		i.putExtra(DATA, urunAdi);
		startActivity(i);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_documentation, menu);
		return true;
	}

}
