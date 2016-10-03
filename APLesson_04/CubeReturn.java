import java.util.Scanner;

public class CubeReturn {
	
	public static void main(String[]args) {
		double side;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the sides:");
		side = keyboard.nextDouble();
		
		print(side);
		
	}
	public static double calcSurf(double side) {
		return Math.pow(side, 2) * 6;
	}
	public static void print(double side) {
		System.out.printf("The surface area of a cube with %.5f sides is %.5f.\n", side, calcSurf(side));
	}
}