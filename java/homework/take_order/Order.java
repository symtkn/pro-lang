import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Order extends JFrame {
	private static JList ymkList;
	private static JList ickList;
	private static JRadioButton odeme1;
	private static JRadioButton odeme2;
	String isStr;
	String ysStr;
	String yStr;
	String iStr;
	private static String[] ListYiyecek = { "Hamburger 5 TL", "Pizza 6 TL", "Tavuk şis 10 TL", "İskender 12 TL", "Cips 2 TL", "Elmalı Turta 2 TL", "Kadayıf 2 TL", "Revani 2 TL", "Lahmacun 3 TL", "Kıyamlı Pide 8 TL", "Kuzu Kebap 10 TL", "Balık 7 TL", "Çorba 2 TL", "Salata 3 TL"};
	private static String[] Listİcecek = {"Su 1 TL", "Meyve suyu 2 TL", "Kola 2 TL", "Fanta 2 TL", "Soda 1 TL", "Ayran 1 TL", "Kırmızı Şarap 130 TL", "Votka 23 TL", "Bira 8 TL", "Süt 1 TL"};
	private static Integer[] yfiyatlar = {5, 6, 10, 12, 2, 2, 2, 2, 3, 8, 10, 7, 2, 3};
	private static Integer[] ifiyatlar = {1, 2, 2, 2, 1, 1, 130, 23, 8, 1};
	static JTextArea analiz;
	JComboBox ymksay;
	JComboBox icksay;
	JButton newOrderBtn;
	JTextField ID;
	JTextField masaNo;
	JTextField hesap;
	JTextField notlar;
	JButton odeBtn;
	int toplam, toplam2;
	int k, i;
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		Order ord = new Order();
		ord.go();	
	}
	
	public void go(){
		JFrame frame = new JFrame("Order Table");
		frame.setLayout(new FlowLayout());
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		newOrderBtn = new JButton("Yeni Sipariş");
		JButton ekleBtn1 = new JButton("EKLE");
		JButton ekleBtn2= new JButton("EKLE");
		odeBtn = new JButton("Ödeme Yap"); 
		notlar = new JTextField(5);
		masaNo =  new JTextField(1);
		ID = new JTextField(5);
		hesap = new JTextField();
		JLabel notLbl = new JLabel("Ek İstekler");
		JLabel noLbl =  new JLabel("Masa No:");
		JLabel IDLbl = new JLabel("Sipariş ID:");
		JLabel hspLbl = new JLabel("Toplam Tutar:");
		JLabel yemek = new JLabel("Yiyecekler");
		JLabel sivilar = new JLabel("İçecekler");
		JLabel ymkAdet = new JLabel("Adet");
		JLabel siviAdet = new JLabel("Adet");
		JLabel tip = new JLabel("Ödeme Tipi");
		
		analiz = new JTextArea(20, 20);
		analiz.setLineWrap(true);
		JScrollPane scroller1 = new JScrollPane(analiz);
		scroller1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		ymkList = new JList(ListYiyecek);
		ymkList.setLayoutOrientation(JList.VERTICAL);
		ymkList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane scroller2 = new JScrollPane(ymkList);
		scroller2.setPreferredSize(new Dimension(250,50));
		ymkList.addListSelectionListener(new NewYmkListener());
		
		
		ickList = new JList(Listİcecek);
		JScrollPane scroller3 = new JScrollPane(ickList);
		scroller3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		ickList.setSelectionMode(DefaultListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ickList.addListSelectionListener(new NewIckListener());
		
		
		String[] ListOdeme = {"Nakit", "Kredi Kartı"};
		odeme1 = new JRadioButton(ListOdeme[0]);
		odeme2 = new JRadioButton(ListOdeme[1]);
		
		odeBtn.addActionListener(new odemeListener());
		
		String[] ymkAdt = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		ymksay = new JComboBox(ymkAdt);
		ymksay.setBackground(Color.red);
		ymksay.addItemListener(new ymkSayListener());
		
		String[] ickAdt = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		icksay = new JComboBox(ickAdt);
		icksay.setBackground(Color.blue);
		icksay.addItemListener(new ickSayListener());
		
		ekleBtn1.addActionListener(new ymkEkle());
		ekleBtn2.addActionListener(new ickEkle());
		newOrderBtn.addActionListener(new newOrderListener());
		
		panel1.add(newOrderBtn);
		panel1.add(notLbl);
		panel1.add(notlar);
		panel1.add(yemek);   
		panel1.add(scroller2);
		panel1.add(sivilar);
		panel1.add(scroller3);
		panel1.add(tip);
		panel1.add(odeme1);
		panel1.add(odeme2);
		frame.getContentPane().add(BorderLayout.WEST, panel1);
		panel2.add(noLbl);
		panel2.add(masaNo);
		panel2.add(ymkAdet);
		panel2.add(ymksay);
		panel2.add(ekleBtn1);
		panel2.add(siviAdet);
		panel2.add(icksay);
		panel2.add(ekleBtn2);
		panel2.add(odeBtn);
		frame.getContentPane().add(BorderLayout.CENTER, panel2);
		panel3.add(IDLbl);
		panel3.add(ID);
		panel3.add(scroller1);
		panel3.add(hspLbl);
		panel3.add(hesap);
		frame.getContentPane().add(BorderLayout.EAST, panel3);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
	public class ymkSayListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
			ysStr = (String)ymksay.getSelectedItem();
		
		}
	}
	public class odemeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == odeBtn){
				int tplm = toplam + toplam2;
				hesap.setText("" + tplm);
				//SaveFile(analiz.getText());
				WriteAFile.yaz("Masa ID: " + ID.getText() + "\tMasa No: " + masaNo.getText() + "\n" + analiz.getText() + "\nEk İstekler:" + notlar.getText());
			}
			
		}
	}
	
	public class ickEkle implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			analiz.append(iStr + " X " + isStr + "\n");
			
			for(String t : Listİcecek){
				if (t.equals(iStr)){
					toplam += (ifiyatlar[k] * (Integer.parseInt(isStr)));
					k = 0;
					break;
				}
				else{
					k += 1;
				}
			}
		}
	}
	public class ymkEkle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			analiz.append(yStr + " X " + ysStr + "\n");
			
			for(String tl : ListYiyecek){
			
				if (tl == yStr){
					toplam2 += (yfiyatlar[i] * (Integer.parseInt(ysStr)));
					i = 0;
					break;
				}
				else{
					i += 1;	
				}
			}
		}
		
	}
	public class ickSayListener implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			isStr = (String) icksay.getSelectedItem();
			
		}
	}
	public class newOrderListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == newOrderBtn){
				Random r = new Random();
				int sayi = r.nextInt(1000);
				sayi = 1000 + sayi;
				ID.setText("" + sayi);
				analiz.setText("");
				hesap.setText("");
				notlar.setText("");
				masaNo.setText("");
				notlar.setText("");
				toplam = 0;
				toplam2 = 0;
			}
			
		}
		
	}
	
	private class NewYmkListener implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			yStr = (String)ymkList.getSelectedValue();
			
		}
		
	}
	
	public class NewIckListener implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			iStr = (String)ickList.getSelectedValue();
		}
		
	}
	
}
