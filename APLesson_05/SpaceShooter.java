import java.util.Scanner;

public class SpaceShooter {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your target :");
		int target = keyboard.nextInt();
		int enemyloc = (int)(Math.random()*3 + 1);
		
		if (target == enemyloc) {
			System.out.println("It's a hit!");
		}
		else { //in all other conditions but the if above
			System.out.println("Keep trying!");
		}
	}
}