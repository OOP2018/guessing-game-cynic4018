import java.util.Random; 
/**
 * GuessingGame class is about game that guessing a secret number.
 * this class that extends from NumberGame.
 * @author Katapon Sinpunyawong
 * @version 2018.01.12
 */
public class KataponGame extends NumberGame{
	/** upper bound for secret number */
	private int upperBound;
	 /** the solution to the game */
	private int secret;
	/** counter to count in guess method*/
	private int counter = 0;
	
	public KataponGame(){
		this(100);
	}
	/**
	 * Random a secret number.
	 *@param tell a hint to guess secret number.
	 */
	public KataponGame(int upperbound){
		// create the random number for secret.
		Random rand = new Random();
		this.upperBound = upperbound;
		// random secret number between 1-upperbound(100).
		this.secret = rand.nextInt(upperbound) + 1;
		super.setMessage("Secret Number between 1-"+ upperbound + ".");
	}
	
	/**
	 * guess method that for check guess number that too large or too small.
	 *@param Tell you that guess number is too large or too small. 
	 *@return True if you guess number that correct. 
	 *		  False if you guess number not correct(so close or not).
	 */
	public boolean guess(int number){
		counter++;
		if (number == secret) {
    		super.setMessage("Correct! The secret number is "+secret);
    		return true;
    	}
    	if (number < 3*secret/4) {
    		super.setMessage("Oh! Your answer is SO small!!.");
    	}
    	else if (number < secret) {
    		super.setMessage("Your answer is too small.");
    	}
    	else if (number > secret*4/3) {
    		super.setMessage("No! Your answer is SO large!!.");
    	}
    	else /* if (number > secret) */ {
    		super.setMessage("Your answer is too large.");
    	}
    	return false;
	}
	
	/**
	 * getCount for count when use guess method.
	 *@return counter.
	 */
	@Override
	public int getCount(){
		return counter;
	}
	
	/**
	 * getUpperBound for use upperBound.
	 *@return upperBound.
	 */
	@Override
    public int getUpperBound(){
        return upperBound;
    }
	
	/**
	 * toString for describe how to play this game.
	 * @param How to play this game(look like rule).
	 *@return String.format("Guess a secret number.").
	 */
	public String toString(){
		return String.format("Guess a secret number.");
	}
	
	
}

