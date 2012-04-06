import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class GorselHesapMakinesi extends Applet implements ActionListener{
	 
	private static final long serialVersionUID = 1L;
	private Button topla, cikar, carp, bol,us, sil;
	private Label esittir;
	private TextField txt1, txt2, txt3;
	private double sayi1;
	private double sayi2;
	private double sonuc = 0.0;
	Font sekil = new Font("Arial",Font.PLAIN,24);
	
	public void init() {
		setLayout(new GridLayout(5, 2));
		topla = new Button("+");
		cikar = new Button("-");
		carp = new Button("*");
		bol = new Button("/");
		us = new Button("^");
		sil = new Button("SİL");
		esittir = new Label(" = ");
		txt1 = new TextField(10);
		txt2 = new TextField(10);
		txt3 = new TextField(10);
		
		add(txt1);
		add(txt2);
		add(topla);
		topla.addActionListener(this);
		add(cikar);
		cikar.addActionListener(this);
		add(carp);
		carp.addActionListener(this);
		add(bol);
		bol.addActionListener(this);
		add(us);
		us.addActionListener(this);
		add(sil);
		sil.addActionListener(this);
		add(esittir);
		esittir.setFont(sekil);
		add(txt3);
		
}

	public double UsAl(double taban, double ussu) {
		if(ussu == 0)
			return (double)1;
		else
			return (double)(taban * UsAl(taban, --ussu));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		sayi1 = Double.parseDouble(txt1.getText());
		sayi2 = Double.parseDouble(txt2.getText());
		if (e.getSource() == topla)
			sonuc = sayi1 + sayi2;
		if (e.getSource() == cikar)
			sonuc = sayi1 - sayi2;
		if (e.getSource() == carp)
			sonuc = sayi1 * sayi2;
		if (e.getSource() == bol)
			sonuc = sayi1 / sayi2;
		if (e.getSource() == us)
			sonuc = UsAl(sayi1, sayi2);
		txt3.setText("" + sonuc);
		if (e.getSource() == sil) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
		
	}
	public void paint(Graphics g) {
		txt3.setText("" + sonuc);
    }

}