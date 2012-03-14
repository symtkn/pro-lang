import java.util.Scanner;

//import java.util.Scanner;
public class Player {
	int number = 0;
	public void guess() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a guess: ");
		number = keyboard.nextInt();
		//number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number); 
	}      
	
}
