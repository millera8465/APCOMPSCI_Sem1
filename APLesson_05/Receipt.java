import java.util.Scanner;

public class Receipt {
	
	public static void main(String[]args) {
		//User inputs for 4 items and 4 prices
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first item:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter your first price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();

		System.out.println("Please enter your second item:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter your second price:");
		double price2 = keyboard.nextDouble();

		keyboard.nextLine();
		
		System.out.println("Please enter your third item:");
		String item3 = keyboard.nextLine();

		System.out.println("Please enter your third price:");
		double price3 = keyboard.nextDouble();

		keyboard.nextLine();
		
		System.out.println("Please enter your fourth item:");
		String item4 = keyboard.nextLine();
		
		System.out.println("Please enter your fourth price:");
		double price4 = keyboard.nextDouble();
		
		//Subtotal = Add up prices from all 4 items...
		double subtotal = price1 + price2 + price3 + price4;
		
		double discount = discount(subtotal);
		double tax = 0.075 * subtotal;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Tax:", tax);
		format("Total:", total);
		System.out.println("_______________________________");
		System.out.println(" *Thank you for your purchase *");

	}
	public static double discount(double subtotal) {
		double discount = 0;

		if (subtotal >= 2000) {
			discount = 0.15 * subtotal;
		}
		if (subtotal < 2000) {
			discount = 0;
		}
		return discount;
	}
	public static void format(String item, double price) {
		System.out.printf("* %16s ........ %9.2f\n", item, price);
	}
}