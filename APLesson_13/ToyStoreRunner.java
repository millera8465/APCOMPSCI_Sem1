import java.util.Scanner;

public class ToyStoreRunner {
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a list of toys: ");
		
		String toys = keyboard.nextLine();
		
		ToyStore object = new ToyStore(toys);
		
		System.out.println();
		System.out.println(object);
		System.out.println();
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + object.getMostFrequentType());
		
	}
}