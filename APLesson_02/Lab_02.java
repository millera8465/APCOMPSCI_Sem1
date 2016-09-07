public class Lab_02 {
	public static void main(String[] args) {
		int number1 = 8;
		int number2 = 37;
		int product = number1 * number2;
		System.out.println(number1 + " multiplied by " + number2 + " is " + product);
		String Name = "Bob Smith";
		String address = "123 Maple Street";
		String City = "Chicago, Illinois";
		String zip = "29483";
		System.out.println(Name + "\n" + address + "\n" + City + " " + zip);
		int length = 5;
		int height = 25;
		int width = 37;
		int surfaceArea = (length * height * 2) + (height * width * 2) + (length * width * 2);
		System.out.println("The surface area of your rectangular prism is " + surfaceArea);
	}
}