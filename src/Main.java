/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 * @author Katapon Sinpunyawong
 * @version 2018.01.12
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new KataponGame(upperBound);
//		GameConsole ui = new GameConsole( );
		GameSolver ui = new GameSolver( );
		int solution = ui.play( game );
		System.out.println("Secret number is "+solution);
		System.out.println("Count: "+game.getCount());
	}
}
