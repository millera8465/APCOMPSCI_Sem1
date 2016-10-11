import java.util.Random;

import java.util.Scanner;

public class Lesson_05 {
	public static void main(String[]args) {
		
		// begin if statements
		
		int num = 3;
		
		if(num == 3) {
			System.out.println("num equals 3!");
		}
		
		if(num == 5) {
			System.out.println("num equals 5!");
		}
		
		boolean tOrF = false;
		
		if (tOrF) {
			System.out.println("It is true!");
		}
		
		if (!tOrF) {
			System.out.println("No! Untrue!");
		}
		
		if(tOrF()) {
			System.out.println("True!");
		}
		
		if(!tOrF()) {
			System.out.println("False!");
		}
		// end if statements
		
		// begin generating random numbers
		
		int num1 = (int)(Math.random()* 101); // Math.random() returns a random double from 0 to 1 (excluding 1)
		// casting double to int discards any values to the right of the decimal
		// that statement returns a random integer between 0 and 100
		
		System.out.println(num1);
		int num2 = (int)(1 + Math.random() * 100); // random integer between 1 and 100
		System.out.println(num2);
		
		Random rand = new Random();
		int num3 = rand.nextInt(101); // returns a random integer from 0 to 101 (excluding 101) (between 0 and 100)
		System.out.println(num3);
		
		int num4 = rand.nextInt(100) + 1; // returns another random integer between 1 and 100
		System.out.println(num4);
		
		// end generating random numbers
		
		// begin Modulus (%) with if statements
		int num5 = 8 % 6;
		System.out.println(num5);
		
		
		
		int num6 = 8;
		if(num6 % 4 ==0 ) {
			System.out.println(num6 + " is a multiple of 4!");
		}
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int one = keyboard.nextInt();
		System.out.println("Please enter number 2: ");
		int two = keyboard.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if (even) {
			System.out.println("Your number " + (one + two) + " is even!");
		}
		if (!even) {
			System.out.println("Your number " + (one + two) + " is odd!");
		}
		// end Modulus (%) with if statements
	}
	public static boolean tOrF () {
		return 8 >= 5;
	}
}