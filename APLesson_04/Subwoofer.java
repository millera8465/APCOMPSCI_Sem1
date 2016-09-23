import java.util.Scanner;
public class Subwoofer {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		Subwoofer calculator = new Subwoofer();
		System.out.println("Please enter the height:");
		double h = keyboard.nextDouble();
		System.out.println("Please enter the length:");
		double l = keyboard.nextDouble();
		System.out.println("Please enter the width:");
		double w = keyboard.nextDouble();
		
		double v = calculator.calcVol(h, l, w);
		
		System.out.printf("The volume of the subwoofer is %.5f cubic feet.", calculator.toCubicFeet(v));
	}
	public double calcVol(double h, double l, double w) {
		return (h * l * w);
	}
	public double toCubicFeet(double v) {
		return (v / 1728);
	}
}