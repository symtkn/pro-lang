
public class DotCom {
	int[] hücre_dizisi;
	private int say;
	public void setter(int[] diz){
		hücre_dizisi = diz;
	}
	public String kontrol(int tahmin){
		String sonuc = "miss";
		for(int i = 0; i < hücre_dizisi.length; i++){
			if(tahmin == hücre_dizisi[i]) {
				sonuc = "hit";
				hücre_dizisi[i] = -1;
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
