import java.util.Scanner;

public class Circle {
	
	static double r;
	static double area;
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		r = keyboard.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea() {
		area = Math.pow(r, 2) * Math.PI;
	}
	public static void print() {
		System.out.printf("The area of a circle with a radius of %.5f is %.5f", r, area);
	}
}
