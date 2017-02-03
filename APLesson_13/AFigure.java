//extends the toy class

public class AFigure extends Toy {
	
	//creates an AFigure object
	//holds all the same methods as Toy
	public AFigure() {
		super();
	}
	
	public AFigure(String n) {
		super(n);
	}
	
	//overrides the getType() method
	public String getType() {
		//returns "Action Figure"
		return "Action Figure";
	} 
}