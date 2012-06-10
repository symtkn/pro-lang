import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class kullanici{
	String url = "jdbc:mysql://localhost/atm"; // atm veritabani adi
	String username = "root";
	String password = "123456";
	Connection con;
	
	PreparedStatement p;
	ResultSet rs;
	String hspNo;
	String pn;
	int para;
	
	String girdihsp;
	String girdipn;
	
	public void setterGirilenHsp(String girhsp) {
		girdihsp = girhsp; 
	}
	
	public void setterGirilenPin(String girpin) {
		girdipn = girpin; 
	}
	
	public String getterGirilenHsp() {
		return girdihsp;
	}
	
	public String getterGirilenPin() {
		return girdipn;
	}
	
	public String getHesapNo() {
		return hspNo;
	}
	
	public String getPin() {
		return pn;
	}
	
	public int getbakiye() {
		return para;
		
	}
	
	public void setterBakiye(int paracik) {
		para = paracik;
	}
	
	public int bakiyeKontrol(int ihtiyac) {
		if ((para - ihtiyac) < 0) {
			return 0;
		}else{
			return 1;
		}	
	}
	
	public void paraCek(int eksilen){
		
		if (bakiyeKontrol(eksilen) == 1) {
			int kalan = getbakiye() - eksilen; 
			setBakiye(kalan);		
		}
	}
	
	public void setBakiye(int yeniBakiye) {
		try{
			
			String soru = "update hesaplar set bakiye = ? where hesapNo = ? and pin = ? and bakiye = ?";
			con = DriverManager.getConnection(url, username, password);
			
			p = con.prepareStatement(soru);
			p.setInt(1, yeniBakiye);
			p.setString(2, getHesapNo());
			p.setString(3, getPin());
			p.setInt(4, getbakiye());
			p.executeUpdate();
			
		}catch(SQLException ex){
			System.err.println("Veritabani güncellestirmesi yapilamadi.");
			ex.printStackTrace();
		}
	}
	
	public void dbBaglanti(String hesapNo, String pin) {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection)DriverManager.getConnection(url, username, password);
			String sorgu = "select * from hesaplar where hesapNo = ? AND pin = ? ";
			PreparedStatement ps = con.prepareStatement(sorgu);
			ps.setString(1, hesapNo);
			ps.setString(2, pin);
			rs = ps.executeQuery();
		
			while (rs.next()) {
				
				hspNo = rs.getString("hesapNo");
				pn = rs.getString("pin");
				setterBakiye(rs.getInt("bakiye"));
				
			}
			
		}catch(ClassNotFoundException ex){
			System.err.println("Driver yüklenemedi");
	
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Veritabaninda hata!", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
	
	public int hesapNoKontrol() {
		
		if ((Atm.hsbSfr.length()) == 5) {
			return 1;
		}if ((Atm.hsbSfr.length()) == 9){
			return 2;
		}else {
			return 0;
		}
	}
	
	public void paraYatir(int yatirim) {
		setBakiye((getbakiye() + yatirim));
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
