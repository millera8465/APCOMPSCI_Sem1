import java.util.Scanner;

public class CountByX {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the top number: ");
		int top = keyboard.nextInt();
		
		System.out.println("Please enter the number that you want to count by: ");
		int counter = keyboard.nextInt();
		
		for (int i = 1; (i * counter) <= top; i++) {
			System.out.print(i * counter + "\t");
		}
	}
}