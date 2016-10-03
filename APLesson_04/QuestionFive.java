

import java.util.Scanner;

public class QuestionFive {
	public static void main(String[]args){
		
		int number;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int number = keyboard.nextInt();
		
		
		System.out.println(number + " multiplied by 5 is " + multiplyByFive(number));
		
		
	}
	public static int multiplyByFive(int num) {
		
		
		return 5 * num;
	}
}