import java.util.Scanner;
public class Choices {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Do a Math Problem" +
							"\n 2. Answer a question");
		int mathOrWords = keyboard.nextInt();
		if (mathOrWords == 1) {
			System.out.println("What is 2 x 2?");
			int mathAnswer = keyboard.nextInt();
			if (mathAnswer == 4) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("No! Wrong! You lose!");
			}
		}
		else {
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			keyboard.nextLine();
			String wordAnswer = keyboard.nextLine();
			if (wordAnswer.equals("Abraham Lincoln")) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("No! Wrong! You lose!");
			}
		}
	}
}