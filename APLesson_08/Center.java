import java.util.Scanner;
public class Center {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first word: ");
		String one = keyboard.next();
		System.out.println("Please enter your second word: ");
		String two = keyboard.next();
		System.out.println("Please enter your third word: ");
		String three = keyboard.next();
		System.out.println(makeCenter(one));
		System.out.println(makeCenter(two));
		System.out.println(makeCenter(three));
	}
	public static String makeCenter(String word) {
		if (word.length() >= 20) return word;
		return makeCenter(" " + word + " ");
	}
}