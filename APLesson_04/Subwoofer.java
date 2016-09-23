import java.util.Scanner;
public class Subwoofer {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		Subwoofer calculator = new Subwoofer();
		System.out.println("Please enter the height:");
		int h = keyboard.nextInt();
		System.out.println("Please enter the length:");
		int l = keyboard.nextInt();
		System.out.println("Please enter the width:");
		int w = keyboard.nextInt();
		
		int v = calculator.calcVol(h, l, w);
		
		System.out.printf("The volume of the subwoofer is %f cubic feet.", calculator.toCubicFeet(v));
	}
	public int calcVol(int h, int l, int w) {
		return (h * l * w);
	}
	public double toCubicFeet(int v) {
		return (v / 1728.0);
	}
}