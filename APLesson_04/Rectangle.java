import java.util.Scanner;

public class Rectangle {
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of your rectangle:");
		l = keyboard.nextDouble();
		System.out.println("Please enter the width of your rectangle:");
		w = keyboard.nextDouble();
		calcPerim();
		print();
	}
	public static void calcPerim() {
		perimeter = (2 * l) + (2 * w);
	}
	public static void print() {
		System.out.printf("Your rectangle is %.5f ft around", perimeter);
	}
}
