import java.util.Random;

public class Rando {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int num1 = generator.nextInt(2, 11);
		System.out.println("The random int is: " + num1);
		
		int num2 = generator.nextInt(18, 42);
		System.out.println("The random int is: " + num2);
		
		int num3 = generator.nextInt(-18, 18);
		System.out.println("The random int is: " + num3);

	}

}
