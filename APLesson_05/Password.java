import java.util.Scanner;

public class Password{
	static Scanner keyboard;
	static String password = "CompSci";
	static String username = "AndrewMiller";
	public static void main(Sting[]args) {
		passCheck();
	}
	public static void passCheck() {
		keyboard = new Scanner(System.in);
		System.out.println("Please enter your username:");
		usernameentry = keyboard.nextLine();
		System.out.println("Please enter your password:");
		passwordentry = keyboard.nextLine();
		
		if (usernameentry == username && passwordentry == password) {
			
		}
	}
}