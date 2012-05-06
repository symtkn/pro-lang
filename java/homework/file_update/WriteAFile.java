import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile{
	
	static void yaz(String text){
		// TODO Auto-generated method stub
		try{
			FileWriter file = new FileWriter(dosya_adi, true); //Dosyanın sonuna ekleme yapabilmek için true terimini eklememiz gerekiyor.
			file.write(text);						//Her ekleme anında append işlevinin görevi yerine getirilmiş olur.
			file.close();
		}catch(IOException ex){
			//System.out.println("couldn't write orders");
			ex.printStackTrace();
		}
	}
}
