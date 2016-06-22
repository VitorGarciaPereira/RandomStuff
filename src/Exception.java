import java.util.*;

public class Exception {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 1;
		do{
			try{
				System.out.println("Enter first number: ");
				int n1 = input.nextInt();
				
				System.out.println("Enter second number: ");
				int n2 = input.nextInt();
				
				int result = n1/n2;
				System.out.print(result);
				x = 2;
			}
			catch(ArithmeticException e){
				System.out.println("You can't do this!");
			}
		} while(x==1);
	}
}
