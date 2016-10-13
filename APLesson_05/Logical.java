import java.util.Scanner;

public class Logical {
	static Scanner keyboard;
	
	public static void main(String[]args) {
		keyboard = new Scanner(System.in);
		// && = and; only true if both are true
		// || = or; true if a and/or b is true
		// ! = not; reverses the true/false value of the statement
		checkNum();
	}
	public static void checkNum() {
	System.out.print("Pick a number between 1 and 10");
		int guess = keyboard.nextInt();
		int number = (int)(Math.random()*10) + 1;
		System.out.println("The number is " + number);
		if (guess >= 1 && guess <= 10) {
			if (guess == number) {
				System.out.println("The number is right!");
			}
			else {
				System.out.println("Wrong!");
				}
		}
		else {
			System.out.println("Make it a 1 - 10 please!");
			checkNum();
		}
	}
}