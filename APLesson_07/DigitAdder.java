import java.util.Scanner;

public class DigitAdder {
	static int number;
	static int sum;
	static int num;
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = keyboard.nextInt();
		sum = 0;
		num = number;
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits() {
		while(num > 0) {
			sum += (num%10);
			num /= 10;
		}
	}
}