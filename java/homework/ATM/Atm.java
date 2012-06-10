import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Atm implements ActionListener {
	
	JTextArea metin;
	JTextField kartGiris;
	JTextField paraCikis;
	private JButton butonlar[];
	private final String degerler[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "ENTER", "CLEAR", "CANCEL"};
	private GridLayout grid = new GridLayout(5, 3, 3, 3);
	JPanel gridPnl = new JPanel();
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JFrame frame =   new JFrame();
	int sira = 1, diger = 0;
	hesap kayitlar = new hesap();
	kullanici musteri = new kullanici();
	static String hsbSfr = "";
	static int sil = 0;
	String girdi = "", secim = "", tercih = "", yatirmaSec = "", yatirPara = "", havaleNo = "", aktarPara = "", cekPara = "", basilanTus;
	int islem, cektutar, banknot, yat, aktarTutar, gec, yatirTutar, ibanSirasi, bakiyeKontrol;
	int adim = 1, basamak = 1;

	
	public void tuslar() {
		gridPnl.setLayout(grid);
		butonlar = new JButton[degerler.length];
		for(int i = 0; i < degerler.length; i ++){
			butonlar[i] = new JButton(degerler[i]);
			butonlar[i].addActionListener(this);
			gridPnl.add(butonlar[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Atm();
	}
	
	public Atm(){
		tuslar();
		
		pnl1.setLayout(new FlowLayout());
		metin = new JTextArea("\t\tHoş Geldiniz!\n\n İşlem Yapabilmek İçin Hesap Numaranızı Giriniz\n\n\t\t", 10, 40);
		metin.setBackground(Color.LIGHT_GRAY);
		metin.setForeground(Color.BLACK);
		pnl1.add(metin);
		
		kartGiris = new JTextField("Kart Girisi", 10);
		kartGiris.setBackground(Color.BLACK);
		kartGiris.setForeground(Color.WHITE);
		pnl1.add(kartGiris);
		
		pnl2.setLayout(new FlowLayout());
		pnl2.add(gridPnl);
		paraCikis = new JTextField("Mevduat Giriş/Çıkış Yeri", 15);
		paraCikis.setBackground(Color.BLACK);
		paraCikis.setForeground(Color.WHITE);
		pnl2.add(paraCikis);
		
		
		frame.setLayout(new BorderLayout());
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(BorderLayout.NORTH, pnl1);
		frame.add(BorderLayout.SOUTH, pnl2);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object btn = e.getSource();
		
		if (btn != butonlar[10] && btn != butonlar[11] && btn != butonlar[12]) {
			if (sira == 2 && adim == 1) {
				islemler(sifreAl(btn));	
				
			}else if (sira == 3 && adim == 2) {
				if (diger == 6) {
					cekPara += tutarAl(btn);
					
				}else if ((diger != 6) && (diger != 7)) {
					paraVer(tutarAl(btn));
				}
			}if (sira == 4 && adim == 3) {
				
				if (yat == 1) {
					yatirPara += tutarAl(btn);
				}else if (yat == 2) {
					if (basamak == 1) {
						aktarPara += tutarAl(btn);	
					
					}else if (basamak == 2) {
						havaleNo += tutarAl(btn);
					}
					
				}else if (yat != 2 && yat != 1 && gec != 0) {

					StringBuffer buf = new StringBuffer(metin.getText());
					buf.deleteCharAt(((metin.getText().length()))-1);
					metin.setText(buf.toString());
					gec = 0;
					
				}else {
					yatir(mevduatIslemleri(btn));
				}
				
			}else {
				hsbSfr += sifreAl(btn);
				if (hsbSfr.length() == 5) {
					musteri.setterGirilenHsp(hsbSfr.substring(0, 5));
				}
			}
		}if (dinle(btn) == 1 && sira == 1) {
			
			if (musteri.hesapNoKontrol() == 1) {
				metin.setText("\n\tLütfen Pin Kodunuzu Giriniz : \n\t\t");
				
			}if (musteri.hesapNoKontrol() == 2) {
				musteri.setterGirilenPin(hsbSfr.substring(5));
				sira++;
				AnaMenuGoster();
				sira = 2;
			}
			
		}if (dinle(btn) == 1 && sira == 3) {
			cektutar = Integer.parseInt(cekPara);
			
			if (tutarAnalizi(cektutar) == 1) {
				metin.setText("\n\n\tParanızı Ve Kartınız Almayı Unutmayın!");
				musteri.paraCek(cektutar);
	
			}else {
				metin.setText("Lütfen Çekmek İstediğiniz Tutarı 10'un Katları Şeklinde Giriniz :");
			}
			
		}if (dinle(btn) == 1 && sira == 4) {
			
			if(yat == 1) {
				yatirTutar = Integer.parseInt(yatirPara);
				musteri.paraYatir(yatirTutar);
				metin.setText("\n\tİşleminiz Başarıyla Gerçekleştirilmiştir\n");
				metin.append("\n\n\tKartınızı Almayı Unutmayınız!");
				
			}else if (yat == 2) {
				gec = 1;
				if (basamak == 1) {
					aktarTutar = Integer.parseInt(aktarPara);
					musteri.paraCek(aktarTutar);
					musteri.hesapCıkıs();
					basamak = 2;
					yatir("2");
				}else {
					if (havaleNo.length() == 9) {
						kayitlar.dbHavaleBaglanti(havaleNo.substring(0, 5), havaleNo.substring(5));
						kayitlar.paraYatir(aktarTutar);
						metin.setText("\nHavale İşleminiz Başarıyla Gerçekleşmiştir");
						kayitlar.hesapCıkıs();
						
					}else {
						metin.append("Eksik ya da fazla Girdiniz");
					}
				}
			}else {
				yatir(mevduatIslemleri(btn));
			}
			
		}if (btn == butonlar[11]) {
			
			StringBuffer sb = new StringBuffer(metin.getText());
			sb.deleteCharAt(((metin.getText().length()))-1);
			metin.setText(sb.toString());
			
			StringBuffer sb2 = new StringBuffer(hsbSfr);
			sb2.deleteCharAt((hsbSfr.length())-1);
			hsbSfr = sb2.toString();
		}if (btn == butonlar[12]) {
			AnaMenuGoster();
			sira = 2;
			adim = 1;
		}
		
	}
	
	public void yatir(String yatirim) {
		
		if (yatirim == "1") {
			metin.setText("\n\tYatıracağınız Tutarı Girerek Onaylayınız : ");
			yat = 1;
			
		}if(yatirim == "2") {
			if(basamak == 1) {
				metin.setText("\nHavale Tutarı : ");
				yat = 2;
			}if (ibanSirasi != 1 && basamak == 2) {
				metin.setText("\nHavale Yapacağınız Hesabın IBAN Numarasını Giriniz :");
				ibanSirasi = 1;
			}
			
		}else if (yatirim != "1" && yatirim == "2") {
			metin.append("\n\nMenüdeki Seçenekler Haricinde İşlem Yapılamaz");
		}
		
		
	}
	
	public String mevduatIslemleri(Object sec) {

		if(sec != butonlar[10] && sec != butonlar[11]) {
			for(int i = 0; i < 10; i ++) {
				if (sec == butonlar[i]) {
					yatirmaSec = degerler[i];
				}
			}
		}
		return yatirmaSec;
	}
	
	public void mevduatSecenekleri() {
		
		metin.setText("\n 1- Para Yatırma\t   2-Hesaplar Arası Fon Transferi");
		metin.append("\n\n\tİşlem Numarasını Giriniz : ");
	}
	
	public String sifreAl(Object btnlar) {
		
		if(btnlar != butonlar[10] && btnlar != butonlar[11]) {
			
			girdi = "";
			
			for(int i = 0; i < 10; i ++) {
				if (btnlar == butonlar[i]) {
					girdi += degerler[i];
					if(bakiyeKontrol != 1){
						metin.append("*");
					}
				}
			}
		}
		return girdi;	
	}
	
	public void AnaMenuGoster() {
		
		musteri.dbBaglanti(musteri.getterGirilenHsp(), musteri.getterGirilenPin());	
		
		metin.setText("Ana Menü\n\t");
		metin.append("1- Bakiye Görüntüleme\n\t");
		metin.append("2- Para Çekme\n\t");
		metin.append("3- Mevduat\n\t");
		metin.append("4- Exit\n\n\t");
		metin.append("İşlem Numarasını Giriniz:  ");	
		
	}
	
	public void islemler(String is) {
		
		islem = Integer.parseInt(is);
		
		switch (islem) {
		case 1:
			String tutar = String.format("\n\n\t\tBAKİYE : %,d", musteri.getbakiye());
			metin.setText(tutar);
			bakiyeKontrol = 1;
			break;
			
		case 2:
			sira = 3;
			adim = 2;
			paraCekme();
			break;
			
		case 3:
			adim = 3;
			sira = 4;
			mevduatSecenekleri();
			break;
			
		case 4:
			musteri.hesapCıkıs();
			metin.setText("\n\n\tKartınızı Almayı Unutmayın!");
			
		}
	}
	
	public void paraCekme() {
		metin.setText("1- 10\t\t");
		metin.append("4- 100\n\n");
		metin.append("2- 20\t\t");
		metin.append("5- 200\n\n");
		metin.append("3- 50\t\t");
		metin.append("6- DİĞER\n\n");
		metin.append("7- Ana Menü");
	}
	
	public void paraVer(String miktar) {
		
		int mik = Integer.parseInt(miktar);
		
		switch (mik) {
		case 1:
			if (musteri.bakiyeKontrol(10) == 1) {
				musteri.paraCek(10);
				metin.setText("\n\n\t\tParanızı ve Kartınızı Almayı Unutmayın!");
			}else {
				metin.setText("\n\n\t\tBakiye Yetersiz");
			}
			break;
			
		case 2:
			if (musteri.bakiyeKontrol(20) == 1) {
				musteri.paraCek(20);
				metin.setText("\n\n\t\tParanızı ve Kartınızı Almayı Unutmayın!");
			}else {
				metin.setText("\n\n\t\tBakiye Yetersiz");
			}
			
			break;
			
		case 3:
			if (musteri.bakiyeKontrol(50) == 1) {
				musteri.paraCek(50);
				metin.setText("\n\n\t\tParanızı ve Kartınızı Almayı Unutmayın!");
			}else {
				metin.setText("\n\n\t\tBakiye Yetersiz");
			}
			break;
			
		case 4:
			if (musteri.bakiyeKontrol(100) == 1) {
				musteri.paraCek(100);
				metin.setText("\n\n\t\tParanızı ve Kartınızı Almayı Unutmayın!");
			}else {
				metin.setText("\n\n\t\tBakiye Yetersiz");
			}
			break;
			
		case 5:
			if (musteri.bakiyeKontrol(200) == 1) {
				musteri.paraCek(200);
				metin.setText("\n\n\t\tParanızı ve Kartınızı Almayı Unutmayın!");
			}else {
				metin.setText("\n\n\t\tBakiye Yetersiz");
			}
			break;
			
		case 6:
			metin.setText("\n\n\t\tTutarı Giriniz :  ");
			diger = 6;
			break;
			
		default:
			diger = 7;
			AnaMenuGoster();
			break;
		}
	}
	
	public int tutarAnalizi(int tutar) {
		if (tutar % 10 == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public String tutarAl(Object tus) {
		
		basilanTus = "";
		if (tus != butonlar[10] && tus != butonlar[11]){
	
			for(int i = 0; i < 10; i++) {
				if (tus == butonlar[i]) {
					basilanTus += degerler[i];
					metin.append(basilanTus);
				}
			}
		}
		return basilanTus;
	}
	
	public int dinle(Object tik) {
		
		if (tik == butonlar[10]) {
			return 1;
		}else {
			return 0;
		}
		
	}
}
