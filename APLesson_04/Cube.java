import java.util.Scanner;

public class Cube {
	
	static double side;
	static double sa;

	public static void main(String[]args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the sides:");
		side = keyboard.nextDouble();
		
		calcSurf();
		print();
		
	}
	public static void calcSurf() {
		sa = Math.pow(side, 2) * 6;
	}
	public static void print() {
		System.out.printf("The surface area of a cube with %.5f sides is %.5f.\n", side, sa);
	}
}