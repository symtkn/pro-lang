import javax.swing.*;

public class GuessGame {
	static void distance(int gNumber, int tNumber) {

            int difference = tNumber - gNumber;

            if (difference >= -3 && difference <= 5|| difference <= 3 && difference >= -5)
            {
                    System.out.println("	U're get closer...");
            }else{
                    System.out.println("	U're receding... ");
            }
    }

	static void startGame() {
		int chance = 3;
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		System.out.println("Welcome to Game The Number Guess. Player can play " + chance + " times in this game.");
		
		for(int i = chance ; i > 0; --i) {
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
	
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			if (p1isRight || p2isRight || p3isRight){
				System.out.println("We have a winner");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				JOptionPane.showMessageDialog(null, "Your guess is correct. Congratulations!");
				break;
			} else {
				if(i - 1 > 0) {
					System.out.println("Don't worry, You may try more " +(i-1)+ " times");
					System.out.println("First player:");
					distance(guessp1, targetNumber);
					System.out.println("Second player:");
					distance(guessp2, targetNumber);
					System.out.println("Third player:");
					distance(guessp3, targetNumber);
				}
				if(i == 1) {
					JOptionPane.showMessageDialog(null, "Game Over");
					break;
				}
			}
		}
	}
}
