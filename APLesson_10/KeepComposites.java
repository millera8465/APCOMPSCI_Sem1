import java.util.Arrays;
import java.util.ArrayList;
public class KeepComposites {
	public static void main(String[]args) {
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		Arrays.asList(numbers);
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
		removeComposites(nums);
		System.out.println(nums);
	}
	public static int gFactor(int n) {
		for (int i=2; i<=(n-1); i++) {
			if (n%i==0) {
				return 1;
			}
		}
		return 0;
	}
	public static void removeComposites(ArrayList<Integer> nums) {
		for (int i=0; i<nums.size(); i++) {
			if (gFactor(nums.get(i)) == 0) {
				nums.remove(i);
			}
		}
	}
}