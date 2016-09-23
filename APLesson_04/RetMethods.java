import java.util.Scanner;
public class RetMethods {
	public static void main(String[]args) {
		RetMethods average = new RetMethods();
		Scanner keyboard = new Scanner(System.in);
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		int n3 = keyboard.nextInt();
		double avg = average.calcAvg(n1, n2, n3);
		System.out.printf("The average is %10.2f\n", avg);
	}
	public double calcAvg(int one, int two, int three) {
		return (one + two + three) / 3.0;
	}
}