/**
 * The class that automatic find secret number in NumberGame.
 * (That look like GameConsole+GuessingGame class but No player and automatic find secret number).
 * @author Katapon Sinpunyawong
 */
public class GameSolver {
	
		public int play(NumberGame game){
			
			// Describe the game (How to play).
			System.out.println( game.toString() );
			int guess;
			int max = game.getUpperBound();
			int min = 1;
			
			while(true)
			{
				// Tell you hint in the first time and tell you answer too small or large(so close or not).
				System.out.println( game.getMessage() );
				// random secret number between 1-upperbound(100).
				guess = (min+max)/2;
				
				System.out.println("Your answer? "+ guess);
				boolean correct = game.guess(guess);
				
				if(correct == true) 
				{
					// For tell you correct.
					System.out.println( game.getMessage() );
					break;
				}
				else 
				{
					if (game.getMessage().contains("large")) 
					{
						max = guess;
	                }
	                if (game.getMessage().contains("small")) 
	                {
						min = guess;	
	                }
	            }
			}
			return guess;
		}
	
}
