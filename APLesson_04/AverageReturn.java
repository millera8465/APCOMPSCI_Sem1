import java.util.Scanner;

public class AverageReturn {
	
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		num1 = keyboard.nextDouble();
		
		System.out.println("Please enter the second number:");
		num2 = keyboard.nextDouble();
		
		System.out.println("Please enter the third number:");
		num3 = keyboard.nextDouble();
		print();
	}
	public static double average() {
		return (num1 + num2 + num3) / 3;
	}
	public static void print() {
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f.\n", num1, num2, num3, average());
	}
}