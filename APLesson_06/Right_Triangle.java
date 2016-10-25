import java.util.Scanner;

public class Right_Triangle {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your word:");
		String word = keyboard.next();
		
		System.out.println();
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.println(word.substring(i));
		}
	}
}