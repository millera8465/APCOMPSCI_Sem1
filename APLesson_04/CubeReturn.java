import java.util.Scanner;

public class CubeReturn {
	
	static double side;

	public static void main(String[]args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the sides:");
		side = keyboard.nextDouble();
		
		print();
		
	}
	public static double calcSurf() {
		return Math.pow(side, 2) * 6;
	}
	public static void print() {
		System.out.printf("The surface area of a cube with %.5f sides is %.5f.\n", side, calcSurf());
	}
}