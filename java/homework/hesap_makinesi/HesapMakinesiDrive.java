import java.util.*;

public class HesapMakinesiDrive {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String semboller;
		
		System.out.println("Klavyeden birinci sayiyi giriniz: ");
		Scanner tara = new Scanner(System.in);
		int deger = tara.nextInt();
		
		System.out.println("Klavyeden ikinci sayiyi giriniz: ");
		int deger2 = tara.nextInt();
		
		semboller = "(Çarpma => *\tBolme => /\tToplama => +\tCıkarma => -\tUs Alma => u)";
		System.out.println("Klavyeden yapmak istediğiniz işlemin sembolünü giriniz:\n " + semboller);
		String sembol = tara.next();
		
		char[] myChar;
        myChar = sembol.toCharArray();
		System.out.println("Sonuc:  " + (HesapMakinesi.islem(deger, deger2, myChar[0])));
		//System.exit(0);

	}
}