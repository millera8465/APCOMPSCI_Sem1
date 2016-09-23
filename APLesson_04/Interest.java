import java.util.Scanner;
public class Interest {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		Interest calculator = new Interest();
		
		System.out.println("Please enter your interest rate:");
		double r = keyboard.nextDouble();
		System.out.println("Please enter your principal:");
		double p = keyboard.nextDouble();
		System.out.println("Please enter the number of times your loan is compounded per year");
		double n = keyboard.nextDouble();
		System.out.println("Please enter the life of the loan (in years):");
		double t = keyboard.nextDouble();
		double a = calculator.payment(r, p, n, t);
		System.out.printf("Your total monthly payment is %.2f.\n", calculator.monthly(a, t));
	}
	public double payment(double r, double p, double n, double t) {
		return (p * Math.pow(1 + r/n, n * t));
	}
	public double monthly(double a, double t) {
		return (a / (t * 12));
	}
}