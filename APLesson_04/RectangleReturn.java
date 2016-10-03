import java.util.Scanner;

public class RectangleReturn {
	
	public static void main(String[]args) {
		double l;
		double w;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of your rectangle:");
		l = keyboard.nextDouble();
		System.out.println("Please enter the width of your rectangle:");
		w = keyboard.nextDouble();
		print(l, w);
	}
	public static double calcPerim(double l, double w) {
		return (2 * l) + (2 * w);
	}
	public static void print(double l, double w) {
		System.out.printf("Your rectangle is %.5f ft around.\n", calcPerim(l, w));
	}
}