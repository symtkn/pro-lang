
public class DotCom {
	int[] hucre_dizisi;
	private int say;
	public void setter(int[] diz){
		hucre_dizisi = diz;
	}
	public String kontrol(int tahmin){
		String sonuc = "miss";
		for(int i = 0; i < hucre_dizisi.length; i++){
			if(tahmin == hucre_dizisi[i]) {
				sonuc = "hit";
				hucre_dizisi[i] = -1;
				say++;
				break;
			}
		}
		if(say == 3){
			sonuc = "kill";
		}			
		return sonuc;
	}
}
