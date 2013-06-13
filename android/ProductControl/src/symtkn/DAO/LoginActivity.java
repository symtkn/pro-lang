package symtkn.DAO;

import symtkn.productcontrol.Add_ListActivity;
import symtkn.urundenetimi.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	Button kaydet, giris;
	EditText ad, soyad, passwd, email, adData, userpswd;
	private DAO dao1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
			
		dao1 = new DAO(this);
		kaydet = (Button)findViewById(R.id.login);
		giris = (Button)findViewById(R.id.singup);
		ad = (EditText)findViewById(R.id.editPersonName);
		soyad = (EditText)findViewById(R.id.editSurname);
		email = (EditText)findViewById(R.id.editEmail);
		passwd = (EditText)findViewById(R.id.editPassword);
		adData = (EditText)findViewById(R.id.editUserName);
	    userpswd = (EditText)findViewById(R.id.editUserPasswd);
			
	    kaydet.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View v) {
				try
				{
						
					ekleme(ad.getText().toString(), soyad.getText().toString(), email.getText().toString(), passwd.getText().toString());

				}
				finally
				{
					dao1.close();
				}
			}
					
	    });
		giris.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View v) {
				try 
				{
					GirisYap(adData.getText().toString(), userpswd.getText().toString());
				}
				finally
				{
					dao1.close();
				}
					
			}
		});
	}
		
	private void ekleme(String adi, String soyadi, String eposta, String sifre) {
		SQLiteDatabase db = dao1.getWritableDatabase();
		ContentValues cv1 = new ContentValues();
		cv1.put("ad", adi);
		cv1.put("soyad", soyadi);
		cv1.put("email", eposta);
		cv1.put("password", sifre);
		db.insertOrThrow("kullanicilar", null, cv1);
		Toast.makeText(this, "Baþarýyla kayýt oldunuz!",Toast.LENGTH_SHORT).show();
			
			
	}
	
	private void GirisYap(String userAd, String userSifre){
		String [] cols = {"ad", "password"};
		String selections = "ad=? and password=?";
		String [] selectionArgs = {userAd, userSifre};
		SQLiteDatabase db = dao1.getReadableDatabase();
		Cursor cursorKayit = db.query("kullanicilar", cols, selections, selectionArgs, null, null, null);
		if(cursorKayit.getCount() != 0){
			Intent intent = new Intent(this, Add_ListActivity.class);
			startActivity(intent);
			
		}
		else {
			Toast.makeText(this, "Lütfen önce kayýt olunuz!",Toast.LENGTH_LONG).show();
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}

}
