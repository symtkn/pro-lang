
public class HesapMakinesi {
	
	static int UsAl(int taban, int us) {
		if(us == 0)
			return 1;
		else
			return taban * UsAl(taban, --us);
	}
	
	static float islem(int say1, int say2, char ifade) {
		
		switch(ifade){
			case '*':
				return say1 * say2;
			case '/':
				return (float)say1 / (float)say2;
			case '+':
				return say1 + say2;
			case '-':
				return say1 - say2;
			case 'u': case 'U':
				return UsAl(say1, say2);
		}
		return 0;
	}
}