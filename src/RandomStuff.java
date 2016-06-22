
public class RandomStuff {
	public static void main(String[] args){
		/*double a = 5.02;
		double b = 0.01;
		double c = a + b;
		System.out.print(c);
		sayHello();*/
		
		int roll;
		System.out.println("Here are 100 random rolls of the dice: ");
		for (int i = 0; i < 100; i++) {
			roll = randomInt(1, 6);
			System.out.print(roll + " ");
		}
		System.out.println();
	}
	
	public static int randomInt(int low, int high){
		int result = (int) (Math.random() * (high - low + 1)) + low;
		return result;
	}
}
