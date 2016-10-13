import java.util.Scanner;

public class BMIPart2 {
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		double h;
		double w;
		System.out.println("Please enter your height in inches: ");
		h = keyboard.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		w = keyboard.nextDouble();
		double bmi = 703 * (w) / (Math.pow(h,2));
		String condition = calcCondish(bmi);
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition);
	}
	public static String calcCondish(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		}
		else if (bmi < 25) {
			return "Normal";
		}
		else if (bmi < 30) {
			return "Overweight";
		}
		else if (bmi < 35) {
			return "Obese";
		}
		else if (bmi < 40) {
			return "Very Obese";
		}
		else {
			return "Morbidly Obese";
		}
	}
}