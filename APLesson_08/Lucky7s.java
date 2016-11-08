import java.util.Scanner;
public class Lucky7s {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		System.out.println(luck(keyboard.nextInt()));
	}
	public static int luck(int num) {
		if (num > 0) {
			if (num%10 == 7) return 1 + luck(num/10);
			return luck(num/10);
		}
		return 0;
	}
}