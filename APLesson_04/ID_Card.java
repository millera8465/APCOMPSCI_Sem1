import java.util.Scanner;

public class ID_Card {
	public static void main(String[] args) {
		ID_Card printer = new ID_Card();
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter your first name:");
		String firstName = keyboard.next();
		
		System.out.println("Enter your last name:");
		String lastName = keyboard.next();
		
		System.out.println("Enter your title:");
		String title = keyboard.next();
		
		keyboard.nextLine();
		System.out.println("Enter the school site:");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		System.out.println("***********************************");
		printer.formatter(school, year);
		printer.formatter(firstName, lastName);
		printer.formatter(title, subject);
		System.out.println("***********************************");
	}
	public void formatter(String input1, String input2) {
		System.out.printf("* %13s %17s *\n", input1, input2);
	}
}
