import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDotComTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDotCom dot = new ArrayListDotCom();
		int hak = 5;
		ArrayList<String> degerler = new ArrayList<String>();
		degerler.add("7");
		degerler.add("3");
		degerler.add("7");
		degerler.add("5");
		dot.setter(degerler);
		while(hak > 0){
			Scanner tara = new Scanner(System.in);
			System.out.print("Değeri giriniz: ");
			String veri = tara.next();
			String cikti = dot.kontrol(veri);
			System.out.println(cikti);
			hak--;
			if(cikti.equals("kill")){
				System.out.println("Doğru yerleri buldunuz.");
				break;
				}
			}if(hak == 0){
				System.out.println("Tahmin hakkınız bitti.");
			}
	}
}
