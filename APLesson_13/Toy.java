// abstract class for different toy objects

public abstract class Toy {
	
	
	//name: holds the name of the toy
	private String name;
	
	//count: holds how many of that toy in the system
	private int count;
	
	//default constructor
	public Toy() {
		this.name = "";
		//sets count equal to 1
		this.count = 1;
	}
	
	//constructor with String parameter
	public Toy(String n) {
		this.name = n;
		//sets count equal to 1
		this.count = 1;
	}
	
	//Accessors
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	
	//Modifiers
	public void setName(String n) {
		this.name = n;
	}
	
	public void setCount(int c) {
		this.count = c;
	}
	
	
	//Abstract Method
	public abstract String getType();
	
	
	
	//toString(): returns "[Name] [Count]"
	public String toString() {
		return name + " " + count;
	}
}