import java.util.ArrayList;

public class ArrayListDotCom {
	ArrayList<String> deger_listesi;
	
	public void setter(ArrayList<String> girisListesi){
		deger_listesi = girisListesi;
	}
	public String kontrol(String tahmin){
		String sonuc = "miss";
		boolean bul = deger_listesi.contains(tahmin); 
		if(bul == true){
			int index = deger_listesi.indexOf(tahmin);
			deger_listesi.remove(index);
			sonuc = "hit"; 
		}if(deger_listesi.isEmpty()){
			sonuc = "kill"; 
		}			
		return sonuc;
	}
}
