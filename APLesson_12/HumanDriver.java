import java.util.Scanner;

public class HumanDriver {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter hair color: ");
		String hair = keyboard.nextLine();
		
		System.out.println("Please enter eye color: ");
		String eyes = keyboard.nextLine();
		
		System.out.println("Please enter skin color: ");
		String skin = keyboard.nextLine();
		
		Human human1 = new Human(hair, eyes, skin);
		System.out.println("Hair: " + human1.getHair());
		System.out.println("Eyes: " + human1.getEyes());
		System.out.println("Skin: " + human1.getSkin());
		
		System.out.println("Please enter hair color: ");
		String hair1 = keyboard.nextLine();
		
		System.out.println("Please enter eye color: ");
		String eyes1 = keyboard.nextLine();
		
		System.out.println("Please enter skin color: ");
		String skin1 = keyboard.nextLine();
		
		human1.setHES(hair1, eyes1, skin1);
		System.out.println("Hair: " + human1.getHair());
		System.out.println("Eyes: " + human1.getEyes());
		System.out.println("Skin: " + human1.getSkin());
	}
}