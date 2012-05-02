import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile{
	
	static void yaz(String text){
		// TODO Auto-generated method stub
		try{
			FileWriter file = new FileWriter("siparisler.txt");
			file.write(text);
			file.close();
		}catch(IOException ex){
			//System.out.println("couldn't write orders");
			ex.printStackTrace();
		}
	}
}