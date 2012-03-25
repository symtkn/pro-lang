import java.util.Scanner;


public class DotComTestDrive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotCom dot = new DotCom();
		int hak = 5;
		int[] degerler = {2, 2, 4};
		dot.setter(degerler);
		while(hak > 0){
			Scanner tara = new Scanner(System.in);
			System.out.print("Değeri giriniz: ");
			int veri = tara.nextInt();
			String cikti = dot.kontrol(veri);
			System.out.println(cikti);
			hak--;
			if(cikti.equals("kill")){
				System.out.println("Doğru yerleri buldunuz.");
				break;
			}
		}
		if(hak == 0){
			System.out.println("Tahmin hakkınız bitti.");
		}
	}
}