import java.awt.*;
import java.awt.FlowLayout; 
import java.awt.event.*;

import javax.swing.*;



public class LoginFrame extends JFrame implements ActionListener {
	private  String userID = "symtkn";
	private String password = "123";
	private static final long serialVersionUID = 1L;
	
	JTextField txt1;
	JTextField txt2;
	JLabel kullaniciAdi;
	JLabel sifre;
	JButton giris;
	
	public LoginFrame(){
		super("Kullanıcı Giriş Ekranı");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		kullaniciAdi=new JLabel("Kullanıcı Adı");
		kullaniciAdi.setFont(new Font("Dialog", Font.BOLD, 15));
		add(kullaniciAdi);
		

	    txt1 = new JTextField(10);
	    add(txt1);
	    txt1.addActionListener(this);
	
	    sifre = new JLabel("Şifre");
	    sifre.setFont(new Font("Dialog", Font.BOLD, 15));
	    add(sifre);
	    
		txt2 = new JTextField(10);
		add(txt2);
		txt2.addActionListener(this);
		
	    giris = new JButton("Giriş");
	    add(giris);
	    giris.addActionListener(this);
	    
		pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String username = txt1.getText();
		String key = txt2.getText(); 
		if(e.getSource() == giris)
		{
			if(username.equals(userID))
			{
				if(key.equals(password)){
					giris.setText(username + ", hesabına giriş yapılmıştır.");
				}else{
					sifre.setText("!!Şifre hatalı...");
					
				}
			}else
				kullaniciAdi.setText("!!Kullanıcı adı hatalı...");
		}
		
	}
	public static void main(String[] args){
		LoginFrame Cerceve = new LoginFrame();
		Cerceve.setSize(500, 100); 
		Cerceve.setVisible(true);
		Cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
