import java.util.*;
public class GetInteger {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("Please enter an integer: ");
		int i = getAnInteger();
		System.out.println("the integer introduced was: "+i);
	}
	
	public static int getAnInteger(){
		
		while(true){
			try{
				return in.nextInt();
			}
			catch (InputMismatchException e){
				in.next();
				System.out.print("that's not an integer, please try again: ");
			}
		}
	}
}
