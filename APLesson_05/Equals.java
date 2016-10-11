import java.util.Scanner;

public class Equals {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word1 = keyboard.next();
		//String word2 = new String("word");
		String word2 = "word";
		//a String is an object, must be compared with the .equals() Method
		if(word1.equals(word2)) {
			System.out.println("The words are equal!");
		}
		else {
			System.out.println("The words are not equal!");
		}
	}
}