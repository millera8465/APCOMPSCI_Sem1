import java.util.Scanner;

public class CircleReturn {
	
	public static void main(String[]args) {
		double r;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		r = keyboard.nextDouble();
		print(r);
	}
	public static double calcArea(double r) {
		return Math.pow(r, 2) * Math.PI;
	}
	public static void print(double r) {
		System.out.printf("The area of a circle with a radius of %.5f is %.5f.\n", r, calcArea(r));
	}
}