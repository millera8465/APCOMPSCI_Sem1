// extends the Toy class

public class Car extends Toy {
	
	//creates a Car object
	//holds all the same methods as Toy
	public Car() {
		super();
	}
	
	public Car(String n) {
		super(n);
	}
	//overrides the getType() method
	public String getType() {
		//returns "Car"
		return "Car";
	}
}