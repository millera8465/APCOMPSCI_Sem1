import java.util.Scanner;
public class MPHRunner {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int d = keyboard.nextInt();
		System.out.println("Please enter the hours: ");
		int h = keyboard.nextInt();
		System.out.println("Please enter the minutes: ");
		int m = keyboard.nextInt();
		
		MilesPerHour object = new MilesPerHour(d, h, m);
		
		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph\n", d, h, m, object.mphCalculator());
	}
}