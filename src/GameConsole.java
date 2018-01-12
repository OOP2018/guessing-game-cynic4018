import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** 
	 * GameConsole that control a play method. 
	 * play method that do about loop and use guess method from GuessingGame class until you get secret number. 
	 * @param Guess a secret number it tell you that answer too small or large.
	 * @return secret number
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// Guess a secret number game.
		System.out.println( game.toString() );
		
		
//		System.out.println( game.getMessage() );
		int guess = 0;
		while(true)
		{
		// Tell you a secret number between 1-upperbound in the first time and tell you answer too small or large.
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		guess = console.nextInt();
		boolean correct = game.guess(guess);
			if(correct == true){
				break;
			}
		}
		return guess;
	}
	
}
