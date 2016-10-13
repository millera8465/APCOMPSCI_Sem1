import java.util.Scanner;
public class YOrN {
	static Scanner keyboard;
	public static void main(String[]args) {
		keyboard = new Scanner(System.in);
		recursion();
	}
	public static void recursion() {
		System.out.println("Would you like to do some recursion?");
		String choice = keyboard.next();
		if (choice.equals("Y") or choice.equals("N")) {
			if (choice.equals("Y")) {
				System.out.println("Yay! Let's do some recursion!");
			}
			else {
				System.out.println("Spoiled the fun!");
			}
		}
		else {
			System.out.println("Please enter Y or N");
			recursion();
		}
	}
}