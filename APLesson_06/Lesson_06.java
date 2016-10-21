import java.util.Scanner;


public class Lesson_06 {
	public static void main(String[]args) {
		/* Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number of cookies: ");
		int cookies = kb.nextInt();
		int batch = 1;
		for (int needed = cookies; needed > 0; needed -= 25) {
			System.out.println("Cookies Needed: " + needed);
			System.out.println("Batch #: " + batch);
			batch++;
		}
		System.out.println("Order Up!!");
		String word = "COMPSCI"; //index starts from 0
		System.out.println(word.length());
		System.out.println(word.indexOf("OMPS"));
		System.out.println(word.indexOf("S"));
		System.out.println(word.substring(1,4)); //top is exclusive
		System.out.println(word.substring(5));
		System.out.println(word.charAt(2)); */
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		for (int i = 1; i <= word.length(); i++) {
			System.out.println(word.substring(0,i));
		}
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}