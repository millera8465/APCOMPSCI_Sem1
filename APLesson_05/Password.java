import java.util.Scanner;

public class Password{
	static Scanner keyboard;
	static String password = "CompSci";
	static String username = "AndrewMiller";
	public static void main(String[]args) {
		passCheck();
	}
	public static void passCheck() {
		keyboard = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String usernameentry = keyboard.nextLine();
		System.out.println("Please enter your password:");
		String passwordentry = keyboard.nextLine();
		
		if (usernameentry.equals(username) && passwordentry.equals(password)) {
			System.out.println("You are granted access!");
		}
		else {
			if (usernameentry.equals(username)) {
				System.out.println("Your password is incorrect!");
			}
			else if (passwordentry.equals(password)) {
				System.out.println("Your username is incorrect!");
			}
			else {
				System.out.println("Your username and password are incorrect!");
			}
			passCheck();
		}
	}
}