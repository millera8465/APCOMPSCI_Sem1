import java.util.Scanner;

public class User {
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public User() {
		firstName = "";
		lastName = "";
		avatar = "";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public User(String fN, String lN) {
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av) {
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public String toString() {
		return "Customer Info...\nFirst Name: " + firstName + 
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fN = keyboard.nextLine();
		System.out.println("Please enter your last name: ");
		String lN = keyboard.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String yOrN = keyboard.nextLine();
		
		if (yOrN.equals("n")) {
			User user1 = new User(fN, lN);
			System.out.println();
			System.out.println(user1);
			System.out.println();
		}
		else {
			System.out.println("Please enter your avatar: ");
			String av = keyboard.nextLine();
			User user1 = new User(fN, lN, av);
			System.out.println();
			System.out.println(user1);
			System.out.println();
		}

		
		System.out.println("Please enter your first name: ");
		String fN2 = keyboard.nextLine();
		System.out.println("Please enter your last name: ");
		String lN2 = keyboard.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String yOrN2 = keyboard.nextLine();
		
		if (yOrN2.equals("n")) {
			User user2 = new User(fN2, lN2);
			System.out.println();
			System.out.println(user2);
		}
		else {
			System.out.println("Please enter your avatar: ");
			String av2 = keyboard.nextLine();
			User user2 = new User(fN2, lN2, av2);
			System.out.println();
			System.out.println(user2);
		}
		
	}
}