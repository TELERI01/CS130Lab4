import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double discriminate, root1, root2;
		
		System.out.println("Enter a: ");
		int a = scan.nextInt();

		System.out.println("Enter b: ");
		int b = scan.nextInt();
		
		System.out.println("Enter c: ");
		int c = scan.nextInt();
		
		discriminate = (Math.sqrt(Math.pow(b,2)-4*a*c));
		
		System.out.println("The Discriminant is: " + discriminate);
		
		root1 = -b + discriminate/2*a;
		
		root2 = -b - discriminate/2*a;
		
		System.out.println("X1" + root1);
		
		System.out.println("X2" + root2);
		
		
		
		
		
				
		

	}

}
