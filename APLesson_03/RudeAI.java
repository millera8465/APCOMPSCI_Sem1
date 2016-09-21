import java.util.Scanner;

public class RudeAI {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.\nI\'d like to ask you a few questions.");
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "?!!! Why would anyone name a baby that?");
		
		System.out.println("How old are you, " + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Ooooo!!! " + age + " is getting up there.");
		
		keyboard.nextLine();
		
		System.out.println("What do you do for fun, " + name + "?");
		String fun = keyboard.nextLine();
		System.out.println("I thought only nerds like to " + fun + "?");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println("Boooo!!! I wouldn\'t wish the sound of " + music + " upon my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
		
		keyboard.nextLine();
		
		System.out.println("What do you want to be when you grow up?");
		String occupation = keyboard.nextLine();
		System.out.println("I think you\'d have to be smarter to be a " + occupation + ".");
		
		System.out.println("So " + name + ", you\'re " + age + "...");
		System.out.println("You like to " + fun + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + occupation + ".");
		System.out.println("I'm only kiddin\' " + name + ".");
	}
}