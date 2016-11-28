import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Lesson_10 {
	public static void main(String[]args) {
		//converting array to ArrayList
		Integer [] numbers = {1, 2, 3, 4, 5};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nums);
		
		//equation solver
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		int i = 0;
		while(i < equation.size()) {
			if(i < equation.size() && equation.get(i).equals("+")) {
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else i++;
		}
		System.out.println(equation);
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		System.out.println("list1 size: " + list1);
		System.out.println("list2 size: " + list2);
		// add(x)...
		// adds x to the end of the array
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("List1 with numbers...\n" + list1);
		System.out.println("List2 with letters...\n" + list2);
		
		//get(x)
		//returns the value at a given index x...
		int number = list1.get(2);
		System.out.println(number);
		
		//set(x, y)
		// overwrites the value at an index x with y
		list1.set(1,8);
		System.out.println(list1);
		
		list2.set(2, "z");
		System.out.println(list2);
		
		//remove(x)
		//deletes the value at position x from the list
		list1.remove(list1.indexOf(3));
		System.out.println(list1);
		
		list2.remove("a");
		System.out.println(list2);
		
		//split(" ")
		//parses the values from a String into an array, ignoring
		//the value in parentheses, calld the delimiter
		
		String letters = "a b c d e f g";
		String[] lets = letters.split(" ");
		//Arrays.toString()
		//parses the Array in parentheses into a String
		System.out.println(Arrays.toString(lets));
		
		//asList()
		//Converts the Array to an Arraylist
		Arrays.asList(lets);
		ArrayList<String> letterList = new ArrayList<String>(Arrays.asList(lets));
		System.out.println(letterList);
		
		//Integer.parseInt()
		//converts numbers in a String to an integer
		String numbs = "1 2 3 4 5 6 7 8 9";
		System.out.println(Integer.parseInt(numbs.substring(4,5)));
		
		//you can start with the string "nums" from above
		//and split() it into an Array
		String[] digits = numbs.split(" ");
		
		//convert the numbers to ints and add them
		//to an ArrayList
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int j = 0; j < digits.length; j++) {
			numList.add(Integer.parseInt(digits[j]));
		}
		//Print the ArrayList
		System.out.println(numList);
		
		//You can now use the numbers in the array in mathematical 
		//operations. The following loop sums all the values in
		//numList.....
		
		int output = 0;
		for(int k=0; k<numList.size(); k++) {
			output += numList.get(k);
		}
		System.out.println(output);
	}
}