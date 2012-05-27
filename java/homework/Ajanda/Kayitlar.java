import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Kayitlar extends JFrame implements ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] aylar = {"1", "2", "3", "4", "5", "6", "7", "8" ,"9", "10", "11", "12"};
	Calendar c;
	int id;
	String gun, ay, str, tarih, sorgu;
	JComboBox ayList;
	JTextArea text;
	JLabel etiket, etk_ay;
	ResultSet rs;
	Statement st;
	
	public Kayitlar() throws SQLException{
		c = Calendar.getInstance();
		etiket = new JLabel("YAPILACAKLAR");
		etk_ay = new JLabel("AY:");
		ayList = new JComboBox(aylar);
		
		this.setLayout(new BorderLayout());
		this.setSize(200, 200);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel2.setLayout(new FlowLayout());
		text = new JTextArea(50,50);
		text.setBackground(Color.blue);
		
		panel.add(etiket);
		panel2.add(etk_ay);
		panel2.add(ayList);
		panel.add(panel2);
		ayList.addItemListener(this);
		this.add(BorderLayout.NORTH, panel);
		this.add(BorderLayout.CENTER, text);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == ayList){
			// "note" tablo ismi
			sorgu = "select * from note where AY ='" + ayList.getSelectedItem() + "'";
			try {
				st = dateBook.con.createStatement();
				rs = st.executeQuery(sorgu);
				while(rs.next()){
					id = rs.getInt("ID");
					gun = rs.getString("GUN");
					ay = rs.getString("AY");
					str = rs.getString("GOREV");
					tarih = gun + "-" + ay + "-" + c.get(Calendar.YEAR);
					text.append("=> ID:"  + id + "   TARİH:" + tarih + "\n"+ str + "\n");
					text.append("");
				}
				
			} catch (SQLException e1) {
				//TODO Auto-generated catch block
				System.err.println( "Sql sorgusu yapılamadi" );
				e1.printStackTrace();
			}finally {
	            if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException ex) { /* ignore */ }
	                rs = null;
	            }
	            if (st != null) {
	                try {
	                    st.close();
	                } catch (SQLException ex) { /* ignore */ }
	                st = null;
	            }
	            if (dateBook.con != null) {
	                try {
	                    dateBook.con.close();
	                } catch (SQLException ex) { /* ignore */ }
	                dateBook.con = null;
	            }
			}
		}
	}
}