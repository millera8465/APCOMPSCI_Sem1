//checks to make sure Toy class is working properly.

public class ToyRunner {
	public static void main(String[]args) {
		
		//creates one AFigure object with name for parameter
		AFigure han = new AFigure("Han Solo");
		
		//creates one Car object with name for parameter
		Car ferrari = new Car("Ferrari");
		
		//prints information on each object using toString()
		System.out.println(han);
		System.out.println(ferrari);
	}
}