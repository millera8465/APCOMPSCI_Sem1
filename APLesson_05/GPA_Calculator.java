import java.util.Scanner;

public class GPA_Calculator {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your math grade:");
		String grade1 = keyboard.next();
		
		System.out.println("Enter your physics grade:");
		String grade2 = keyboard.next();
		
		System.out.println("Enter your band grade:");
		String grade3 = keyboard.next();
		
		System.out.println("Enter your PE grade:");
		String grade4 = keyboard.next();
		
		System.out.println("Enter your english grade:");
		String grade5 = keyboard.next();
		
		System.out.println("Enter your government grade:");
		String grade6 = keyboard.next();
		
		System.out.println("Enter your computer science grade:");
		String grade7 = keyboard.next();
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4)
		+ calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		
		System.out.printf("Your gpa is %1.1f\n", gPoints/7);
	}
	public static double calcPoints(String grade) {
		if (grade.equals("A")) {
			return 4.0;
		}
		if (grade.equals("B")) {
			return 3.0;
		}
		if (grade.equals("C")) {
			return 2.0;
		}
		if (grade.equals("D")) {
			return 1.0;
		}
		if (grade.equals("F")) {
			return 0.0;
		}
		else {
			return 0.0;
		}
	}
}