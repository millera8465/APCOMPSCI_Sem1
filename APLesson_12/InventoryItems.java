import java.util.Scanner;

public class InventoryItems {
	private String manufacturer, name, category;
	private long upc;
	private double price;
	
	public InventoryItems() {
		manufacturer = "";
		name = "";
		category = "";
		upc = 0;
		price = 0;
	}
	public InventoryItems(String m, String n) {
		manufacturer = m;
		name = n;
		category = "";
		upc = (long)(Math.random() * 1000000000);
		
	}
	public InventoryItems(String m, String n, String c, double p) {
		manufacturer = m;
		name = n;
		category = c;
		upc = (long)(Math.random() * 1000000000);
		price = p;
	}
	public String toString() {
		return "Item Information...\nItem Manufacturer: " + manufacturer + 
									"\nItem name: " + name + 
									"\nItem category: " + category +
									"\nUPC: " + upc +
									"\nItem price: $" + price;
	}
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the item manufacturer: ");
		String m = keyboard.nextLine();
		System.out.println("Please enter the item name: ");
		String n = keyboard.nextLine();
		System.out.println("Will you be entering category and price information?");
		String yOrN = keyboard.nextLine();
		
		if (yOrN.equals("n")) {
			InventoryItems item1 = new InventoryItems(m, n);
			System.out.println();
			System.out.println(item1);
		}
		else {
			System.out.println("Please enter the item category: ");
			String c = keyboard.nextLine();
			System.out.println("Please enter the item price: ");
			double p = keyboard.nextDouble();
			InventoryItems item1 = new InventoryItems(m, n, c, p);
			System.out.println();
			System.out.println(item1);
		}
		
	}
}