
public class enumAylar {
	public enum Aylar {
		 Ocak, Şubat, Mart, Nisan, Mayıs, Haziran, Temmuz, Ağustos, Eylül, Ekim, Kasım, Aralık
	};
	public static void main(String[] args) {
		int n = 1;
		for (Aylar ay: Aylar.values()) {
			System.out.println(n + ". ay : " + ay);
			++n;
		}	
	}	

}
