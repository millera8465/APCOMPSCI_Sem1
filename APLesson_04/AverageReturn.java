import java.util.Scanner;

public class AverageReturn {
	
	public static void main(String[]args) {
		double num1;
		double num2;
		double num3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		num1 = keyboard.nextDouble();
		
		System.out.println("Please enter the second number:");
		num2 = keyboard.nextDouble();
		
		System.out.println("Please enter the third number:");
		num3 = keyboard.nextDouble();
		print(num1, num2, num3);
	}
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}
	public static void print(double num1, double num2, double num3) {
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f.\n", 
		num1, num2, num3, average(num1, num2, num3));
	}
}