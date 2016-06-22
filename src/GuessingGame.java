import java.util.Scanner;

public class GuessingGame {
	
	static Scanner in = new Scanner(System.in);
	static boolean keepPlaying = true;
	
	public static void main (String[] args){
		
		System.out.println("Let's play a guessing game!");
		
		while(keepPlaying){
			playARound();
		}
		System.out.println("Thanks for playing!");
	}
	
	public static void playARound(){
		
		boolean validInput;
		int number;
		int guess;
		String answer;
		
		number = (int) (Math.random() * 10) + 1;
		System.out.println("\nI'm thinking of a number " + "between 1 and 10.");
		System.out.print("What do you think it is?");
		
		do{
			guess = in.nextInt();
			validInput = true;
			if(guess < 1 || guess > 10){
				System.out.print("I said between 1 and 10. Please try again.");
				validInput = false;
			}
		} while (!validInput);
		
		//checking the guess
		if(guess == number){
			System.out.println("You right!");
		}
		else{
			System.out.println("You wrong! The number was: " + number);
		}
		
		//asking if user wants to play again
		do{
			System.out.println("Play again? (Y/N)");
			answer = in.next();
			validInput = true;
			if(answer.equalsIgnoreCase("y")){
				keepPlaying = true;
			}
			else if(answer.equalsIgnoreCase("N")){
				keepPlaying = false;
			}
			else{
				validInput = false;
			}
		} while(!validInput);
	}

}
