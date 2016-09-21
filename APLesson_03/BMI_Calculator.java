import java.util.Scanner;

public class BMI_Calculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		
		double bmi = 703 * weight / (height * height);
		
		System.out.println("Your BMI is " + bmi + ".");
	}
}