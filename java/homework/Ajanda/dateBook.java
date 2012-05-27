import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import com.mysql.jdbc.Connection;

/* Veritabanı Ve Tablo Yaratma Asamalari
 *  
 * create database dateBook;     // dateBook adli veritabanı yaratilir
 * use dateBook;                // Kullanilacak veritabani secilir
 * create table note(
 * 		-> ID int not null auto_increment primary key,
 * 		-> GUN varchar(2),
 * 		-> AY varchar(2),
 * 		-> GOREV varchar(200)
 * 		-> )engine = innoDB;    // Update komutlarinin select performansini dusurmemesi icin Tablo yapisini "innoDB" seceriz
 * 
 */
public class dateBook implements ActionListener{
	/**
	 * 
	 */
	static Connection con;
	Statement stmt;
	String gorev;
	Calendar cld;
	int currentMonth, currentDay;
	SpinnerModel monthModel, dayModel;
	JSpinner spnMonth, spnDay;
	JTextArea txt;
	JButton listelebtn, eklebtn;
	JLabel aylbl, gunlbl, not;
	Container c;

	/**
	 * @param args
	 */
	public dateBook(){
		String url = "jdbc:mysql://localhost/dateBook"; // dateBook veri tabani adi
		String username = "root";
		String password = "123456";
		
		cld = Calendar.getInstance();
		currentDay = cld.get(Calendar.DAY_OF_MONTH);
		currentMonth = cld.get(Calendar.MONTH);
		dayModel = new SpinnerNumberModel(currentDay, 1, 31, 1);
		monthModel = new SpinnerNumberModel(currentMonth, 1, 12, 1);
		spnDay = new JSpinner(dayModel);
		spnMonth = new JSpinner(monthModel);
		
		JFrame frame = new JFrame("Ajanda");
		c = frame.getContentPane();
		frame.setLayout(new BorderLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		eklebtn = new JButton("EKLE");
		eklebtn.addActionListener(this);
		listelebtn = new JButton("LİSTELE");
		listelebtn.addActionListener(this);
		txt = new JTextArea(5,20);
		JScrollPane scroller = new JScrollPane(txt);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		aylbl = new JLabel("AY :");
		gunlbl =  new JLabel("GUN :");
		not = new JLabel("NOT:");
		
		panel1.add(gunlbl);
		panel1.add(spnDay);
		panel1.add(aylbl);
		panel1.add(spnMonth);
		panel2.add(eklebtn);
		panel2.add(listelebtn);
		panel3.add(not);
		panel3.add(txt);
		c.add(BorderLayout.NORTH, panel1);
		c.add(BorderLayout.CENTER, panel3);
		c.add(BorderLayout.SOUTH, panel2);
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, username, password);
		}catch ( ClassNotFoundException cnfex ) {
			System.err.println("Jdbc/Mysql-Driver yuklenemedi" );
			cnfex.printStackTrace();
			System.exit( 1 ); 
		}catch ( SQLException sqlex ) {
			System.err.println( "Veritabanina baglanilamadi" );
			sqlex.printStackTrace();
			System.exit( 1 );
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == eklebtn){
			gorev = txt.getText();
			try {
				stmt = con.createStatement();
				// "note" tablo ismi
				stmt.executeUpdate("insert into note(GUN,AY,GOREV) values('" + spnDay.getValue() + "','" + spnMonth.getValue()+ "','"  + gorev + "')");
				txt.setText("");
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.err.println( "Veri eklenemedi" );
				e1.printStackTrace();
			}
				
		}
		else if(e.getSource() == listelebtn){
			try {
				new Kayitlar();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.err.println( "Kayıtlara ulasilamadi" );
				e1.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new dateBook();

	}
}