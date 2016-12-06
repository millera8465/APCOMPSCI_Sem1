import java.util.Scanner;

public class Strings {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String[][] words = new String[4][4];
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				System.out.println("Please enter a word: ");
				words[i][j] = keyboard.next();
			}
		}
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				System.out.printf("%10s",words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}