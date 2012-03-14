import javax.swing.JOptionPane;


public class GameLauncher {

	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		//GuessGame game = new GuessGame();
		int pick = JOptionPane.showConfirmDialog(null, "Is Game The Number Guess running?");
		if(pick == JOptionPane.YES_OPTION) {
			//game.startGame();
			GuessGame.startGame();
			}
	}

}

/**RESULT =>
 *I'm thinking of a number between 0 and 9...
 *Welcome to Game The Number Guess. Player can play 3 times in this game.
 *Number to guess is 3
 *Enter a guess: 1
 *I'm guessing 1
 *Enter a guess: 9
 *I'm guessing 9
 *Enter a guess: 6
 *I'm guessing 6
 *Player one guessed 1
 *Player two guessed 9
 *Player three guessed 6
 *Don't worry, You may try more 2 times
 *First player:
 *	U're get closer...
 *Second player:
 *	U're receding... 
 *Third player:
 *	U're get closer...
 *Number to guess is 3
 *Enter a guess: 0
 *I'm guessing 0
 *Enter a guess: 3
 *I'm guessing 3
 *Enter a guess: 4
 *I'm guessing 4
 *Player one guessed 0
 *Player two guessed 3
 *Player three guessed 4
 *We have a winner
 *Player one got it right? false
 *Player two got it right? true
 *Player three got it right? false
 */
