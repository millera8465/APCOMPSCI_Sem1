import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Receipt printer = new Receipt();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		double taxrate = 0.075;
		double tax = (price1 + price2 + price3) * taxrate;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>\n");
		printer.formatter(item1, price1);
		printer.formatter(item2, price2);
		printer.formatter(item3, price3);
		System.out.println("\n");
		printer.formatter("Subtotal:", price1 + price2 + price3);
		printer.formatter("Tax:", tax);
		printer.formatter("Total:", price1 + price2 + price3 + tax);
		
		System.out.println("\n________________________________________________");
		System.out.println(" * Thank you for your support *");
	}
	public void formatter(String item, double price) {
		System.out.printf("\n*%17s ........\t\t%5.2f", item, price);
	}
}