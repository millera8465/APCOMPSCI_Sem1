import java.util.Scanner;
public class ReverseWord {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = keyboard.next();
		}
		System.out.println("In order...");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println();
		System.out.println("Reversed...");
		reverse(words);
	}
	public static void reverse(String[] words) {
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}