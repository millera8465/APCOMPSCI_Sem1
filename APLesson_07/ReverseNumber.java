import java.util.Scanner;

public class ReverseNumber {
	static int number;
	static int num;
	static int rev;
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = keyboard.nextInt();
		num = number;
		rev = 0;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse() {
		while(num > 0) {
			rev *= 10;
			rev += (num%10);
			num /= 10;
		}
	}
}