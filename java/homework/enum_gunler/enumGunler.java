
public class enumGunler {
	public enum Gunler {
		Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar
	 };
	 	
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Haftanın Günleri");
		for (Gunler gun: Gunler.values()) {
			n = gun.ordinal() + 1;
			if(n == 7)
				System.out.print(n + ". gün : " + gun);
			else
				System.out.print(n + ". gün : " + gun + ",   ");
	    }
	 }

}
