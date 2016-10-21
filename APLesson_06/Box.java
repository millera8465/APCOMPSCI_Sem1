import java.util.Scanner;
public class Box {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = keyboard.next();
		System.out.println();
		
		for (int i = 1; i <= word.length(); i++) {
			System.out.println(word);
		}
	}
}