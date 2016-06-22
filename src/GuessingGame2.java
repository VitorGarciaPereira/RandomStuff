import java.util.Scanner;

public class GuessingGame2 {

		static Scanner in = new Scanner(System.in);
		// main method
		
		public static void main (String[] args){
			
			System.out.println("Let's play a guessing game!");
			do{
				playARound();
				
			} while(askForAnotherRound());
			System.out.println("Thanks for playing!");
		}
		
		public static void playARound(){
			//boolean validInput;
			int number;
			int guess;
			//String answer;
			
			// pick a random number
			
			number = getRandomNumber();
			// get a guess
			System.out.println("I am thinking of a number between 1 and 10");
			System.out.println("What do you think it is?");
			guess = getGuess();
			
			if(number == guess){
				System.out.println("you are rigth");
			}
			else{
				System.out.println("you are wrong the number was: "+number);
			}
			
		}
		
		public static int getRandomNumber(){
			
			return (int) (Math.random() * 10) +1;
		}
		
		public static boolean askForAnotherRound(){
			while(true){
				String answer;
				System.out.println("Play again? (Y/N)");
				answer = in.next();
				if(answer.equalsIgnoreCase("Y")){
					return true;
				}
				else{
					return false;
				}
			}
		}
		
		public static int getGuess(){
			while(true){
				int guess = in.nextInt();
				if(guess < 1 || guess > 10){
					System.out.println("I said between 1 and 10");
				}
				else{
					return guess;
				}
			}
		}
}
