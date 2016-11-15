import java.util.Scanner;
public class Lesson_09 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		/*String [] names = new String[5];
		System.out.println("Please enter 5 names: ");
		//fills the array
		for (int i = 0; i < names.length; i++) {
			names[i] = keyboard.next();
		}
		//print the array (enhanced for loop)
		for(String name : names) {
			System.out.print("\"" + name.length() + "\", ");
		} */
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100)+1;
		}
		for(int num : numbers) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("The sum of the numbers above is... " + sumArray(numbers));
	}
	public static int sumArray(int[] n) {
		int sum = 0;
		for(int num : n) {
			sum += num;
		}
		return sum;
	}
}