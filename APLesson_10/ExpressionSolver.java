import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class ExpressionSolver {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = keyboard.nextLine();
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(expression.split(" ")));
		System.out.println(doEquation(equation));
	}
	public static ArrayList<String> doEquation(ArrayList<String> equation) {
		int i = 0;
		while (i < equation.size()) {
			if ((equation.get(i).equals("*") || equation.get(i).equals("/")) && i < equation.size()) {
				if (equation.get(i).equals("*")) {
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else {
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
			}
			else i++;
		}
		int j = 0;
		while (j < equation.size()) {
			if ((equation.get(j).equals("+") || equation.get(j).equals("-")) && j < equation.size()) {
				if (equation.get(j).equals("+")) {
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) + Integer.parseInt(equation.get(j+1))));
					equation.remove(j-1);
					equation.remove(j);
				}
				else {
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) - Integer.parseInt(equation.get(j+1))));
					equation.remove(j-1);
					equation.remove(j);
				}
			}
			else j++;
		}
		return equation;
	}
}
