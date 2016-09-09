import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		
		System.out.println("Hi, " + name + "! What was your grade on your first test?");
		double testOne = keyboard.nextDouble();
		
		System.out.println("How many points was it worth?");
		double pointsOne = keyboard.nextDouble();
		
		System.out.println("Okay, " + name + ". What was your grade on the second test?");
		double testTwo = keyboard.nextDouble();
		
		System.out.println("How many points was it worth?");
		double pointsTwo = keyboard.nextDouble();
		
		System.out.println("What was your score on the third test, " + name + "?");
		double testThree = keyboard.nextDouble();
		
		System.out.println("How many points was that one worth?");
		double pointsThree = keyboard.nextDouble();
		
		System.out.println("Yikes, that\'s a lot of points! What did you get on the fourth test?");
		double testFour = keyboard.nextDouble();
		
		System.out.println("Nice job, " + name + "! How many points was it worth?");
		double pointsFour = keyboard.nextDouble();
		
		System.out.println("Thanks, " + name + "! Now I can calculate your final grade.");
		double averageScore = 100 * ((testOne / pointsOne) + (testTwo / pointsTwo) + (testThree / pointsThree)
		+ (testFour / pointsFour) ) / 4;
		
		System.out.println("Congratulations! Your average test score was " + averageScore + "%.");
		
		double finalGrade = 100 * (testOne + testTwo + testThree + testFour) / 
		(pointsOne + pointsTwo + pointsThree + pointsFour);
		System.out.println("Your final grade is " + finalGrade + "%.");
	}
}