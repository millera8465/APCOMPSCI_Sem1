import java.util.Scanner;
public class DistanceRunner {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		int firstX = keyboard.nextInt();
		
		System.out.println("Please enter y1: ");
		int firstY = keyboard.nextInt();
		
		System.out.println("Please enter x2: ");
		int secondX = keyboard.nextInt();
		
		System.out.println("Please enter y2: ");
		int secondY = keyboard.nextInt();
		
		Distance object = new Distance(firstX, firstY, secondX, secondY);
		System.out.printf("distance = %.2f\n", object.calcDistance());
		
		object.resetCoordinates();
		System.out.println("Please enter x1: ");
		firstX = keyboard.nextInt();
		
		System.out.println("Please enter y1: ");
		firstY = keyboard.nextInt();
		
		System.out.println("Please enter x2: ");
		secondX = keyboard.nextInt();
		
		System.out.println("Please enter y2: ");
		secondY = keyboard.nextInt();
		
		Distance object1 = new Distance(firstX, firstY, secondX, secondY);
		System.out.printf("distance = %.2f\n", object1.calcDistance());
	}
}