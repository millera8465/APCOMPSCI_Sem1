import java.util.Scanner;

public class CarDriver {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter paint color: ");
		String paint = keyboard.nextLine();
		
		System.out.println("Please enter interior type: ");
		String interior = keyboard.nextLine();
		
		System.out.println("Please enter engine type: ");
		String engine = keyboard.nextLine();
		
		System.out.println("Please enter tires: ");
		String tires = keyboard.nextLine();
		Car car1 = new Car(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: \t" + car1.getPaint());
		System.out.println("Interior: \t" + car1.getInterior());
		System.out.println("Engine: \t" + car1.getEngine());
		System.out.println("Tires: \t" + car1.getTires());
	}
}