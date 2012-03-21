import javax.swing.JOptionPane;

public class SayiAra {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = -1;
		int sayi;
		int[] sayilar = new int[10];
		for(int i = 0; i < 10; i++){
			sayilar[i] = (int) (Math.random() * 21);
		} 
		
		JOptionPane.showMessageDialog(null, "Lütfen, sayı arama aralığınızı 0-20 olarak baz alınız.");
		String aranacak = JOptionPane.showInputDialog(null, "Aradığınız sayıyı giriniz: ");
		sayi = Integer.parseInt(aranacak);
		
		for(int k = 0; k < sayilar.length; k++){
			if(sayilar[k] == sayi){
				index = k;
				JOptionPane.showMessageDialog(null, sayi + " sayısı dizide mevcut ve index numarasıda:  " + index);
				break;
			}
		}	
		if(index == -1)
			JOptionPane.showMessageDialog(null, sayi + " sayısı dizide mevcut değildir.");
	}
}
