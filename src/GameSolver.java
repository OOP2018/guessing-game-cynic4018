/**
 * The class that automatic find secret number in NumberGame.
 * (That look like GameConsole+GuessingGame class but No player and automatic find secret number).
 * @author Katapon Sinpunyawong
 * @version 2018.01.12
 */
public class GameSolver {
		/** 
		 * GameSolver that control a play method. 
		 * play method that do about loop and find a secret number. 
		 * @param only secret number
		 * @return secret number
		 */
		public int play(NumberGame game){
			
			int guess = (game.getUpperBound()+1)/2;
			int max = game.getUpperBound();
			int min = 1;
			
			while(!game.guess(guess))
			{	
					if (game.getMessage().contains("large")) 
					{
						max = guess-1;
						guess = min+(max-min)/2;
	                }
					else if (game.getMessage().contains("small")) 
	                {
						min = guess+1;	
						guess = min+(max-min)/2;
	                }
			}
			return guess;
		}
	
}
