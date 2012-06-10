import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class hesap {
	
	Connection con;
	PreparedStatement p;
	ResultSet rs;
	String hspNo;
	String pn;
	int para;
	
	kullanici kisi = new kullanici();
	
	public void dbHavaleBaglanti(String hesapNo, String pin) {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection)DriverManager.getConnection(kisi.url, kisi.username, kisi.password);
			String sorgu = "select * from hesaplar where hesapNo = ? AND pin = ? ";
			PreparedStatement ps = con.prepareStatement(sorgu);
			ps.setString(1, hesapNo);
			ps.setString(2, pin);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				hspNo = rs.getString("hesapNo");
				pn = rs.getString("pin");
				para = rs.getInt("bakiye");
				
			}
			
		}catch(ClassNotFoundException ex){
			System.err.println("Driver yüklenemedi");
	
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Veritabaninda hata!", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void setBakiye(int yeniBakiye) {
		try{
			
			String soru = "update hesaplar set bakiye = ? where hesapNo = ? and pin = ? and bakiye = ?";
			con = DriverManager.getConnection(kisi.url, kisi.username, kisi.password);
			p = con.prepareStatement(soru);
			p.setInt(1, yeniBakiye);
			p.setString(2, hspNo);
			p.setString(3, pn);
			p.setInt(4, para);
			p.executeUpdate();
			
		}catch(SQLException ex){
			System.err.println("Veritabani güncellestirmesi yapilamadi.");
			ex.printStackTrace();
		}
	}
	
	public void paraYatir(int yatirim) {
		setBakiye((para + yatirim));
	}
	
	public void hesapCıkıs() {
		
		try {
			con.close();
		}catch(SQLException sqlex){
			JOptionPane.showMessageDialog(null, sqlex.getMessage(), "Veritabani kapanma hatasi!", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
			}
	}

}
