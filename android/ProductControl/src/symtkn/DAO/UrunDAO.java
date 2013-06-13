package symtkn.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UrunDAO extends SQLiteOpenHelper {

	public static final String VERITABANI_ADI = "urunYonetimi.db";
	private static final int SURUM = 1;

	public UrunDAO(Context c) {
		super(c, VERITABANI_ADI, null, SURUM);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE urunler(id INTEGER PRIMARY KEY AUTOINCREMET, kod INTEGER, ad TEXT, fiyat TEXT, productImage BLOB);");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXIST urunler");
		onCreate(db);
		
	}
}
