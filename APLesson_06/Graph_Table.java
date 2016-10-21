import java.util.Scanner;
public class Graph_Table {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int integer = keyboard.nextInt();
		System.out.println("Please enter the size of the table: ");
		int tableSize = keyboard.nextInt();
		for (int i = 1; i <= tableSize; i++) {
			System.out.printf("%6d | %6d\n", i, i * integer);
		}
	}
}