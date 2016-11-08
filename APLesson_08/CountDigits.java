import java.util.Scanner;
public class CountDigits {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		System.out.println(countDigits(keyboard.nextInt()));
	}
	public static int countDigits(int num) {
		while(num > 0) {
			return 1 + (countDigits(num/10));
		}
		return 0;
	}
}