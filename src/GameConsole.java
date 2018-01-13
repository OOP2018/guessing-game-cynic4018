import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author Katapon Sinpunyawong
 *  @version 2018.01.12
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
		
		// Describe the game (How to play).
		System.out.println( game.toString() );
		int guess = 0;
		
		while(true)
		{
		// Tell you hint in the first time and tell you answer too small or large(so close or not).
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		guess = console.nextInt();
		boolean correct = game.guess(guess);
			
			if(correct == true)
			{
				// For tell you correct.
				System.out.println( game.getMessage() );
				break;
			}
			
		}
		return guess;
	}
	
}
