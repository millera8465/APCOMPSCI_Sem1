import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	//toyList: An ArrayList of Toy objects
	private ArrayList<Toy> toyList;
	
	//ToyStore object keeps inventory of all the Toy objects
	
	//default constructor
	public ToyStore() {
		//runs loadToys() method with the input list as a parameter
		toyList = new ArrayList<Toy>();
		loadToys("");
	}
	
	//constructor with String parameter (list of toys)
	public ToyStore(String t) {
		//runs loadToys() method with the input list as a parameter
		toyList = new ArrayList<Toy>();
		loadToys(t);
	}
	
	//takes in a String which is a list of "toys", and uses a for loop to check if each toy is in the list
	//@param ts
	public void loadToys(String ts) {
		
		//ArrayList of Strings - using ts.split(", ") - called "toys"
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		String name;
		//for loop from 0 to the size of toys
		for (int i = 0; i < toys.size(); i+=2) {
			
			//String name - toys @ position i
			name = toys.get(i);
			
			//String type - toys @ position i + 1
			String type = toys.get(i+1);
			if (type.equals("AF")) {
				AFigure object1 = new AFigure(name);
				//create a new Toy object - @return from getThatToy() @param name if the return is null
				
				if (getThatToy(name)) {
					object1.setCount(object1.getCount()+1);
					for (int j = 0; j < toyList.size(); j++) {
						if (toyList.get(j).getName().equals(object1.getName())) {
							toyList.set(j, object1);
						}
					}
				}
				//Otherwise the toy is already on the list, so set the count to +1
				else toyList.add(object1);
			}
			else {
				Car object2 = new Car(name);
				//create a new Toy object - @return from getThatToy() @param name if the return is null
			
				if (getThatToy(name)) {
					object2.setCount(object2.getCount()+1);
					for (int j = 0; j < toyList.size(); j++) {
						if (toyList.get(j).getName().equals(object2.getName())) {
							toyList.set(j, object2);
						}
					}
				}
				//Otherwise the toy is already on the list, so set the count to +1
				
				else toyList.add(object2);
			}

		}
	}
	
	//Checks toyList by name to see if the toy is in the list
	//@param String nm
	public boolean getThatToy(String nm) {
		//for each Toy object in toyList
		for (Toy object : toyList) {
			
			//If the name of the toy == nm
			if (object.getName().equals(nm)) {
				
				//return the Toy object
				return true;
			}
		}
		//return null otherwise
		return false;
	}
	
	//Finds the Toy (by name) that occurs most frequently in the list
	public String getMostFrequentToy() {
		
		//new String "name"
		String name = "";
		
		//new int "max" - Integer.MIN_VALUE
		int max = Integer.MIN_VALUE;
		
		//for each Toy object in toyList
		for (Toy object : toyList) {
			
			//if max < the count of the Toy
			if (max < object.getCount()) {
				
				//max = the count of the Toy
				max = object.getCount();
				
				//name = the name of the Toy
				name = object.getName();
			}
		}
		
		//return the name
		return name;
	}
	
	//finds the type of Toy that occurs most frequently in the list.
	public String getMostFrequentType() {
		
		//new int cars - set to 0
		int cars = 0;
		
		//new int figures - set to 0
		int figures = 0;
		
		//for each Toy in toyList
		for (Toy object : toyList) {
			
			//if the type of Toy is Car
			if (object.getType().equals("Car")) {
				
				//add one to cars
				cars++;
			}
			
			//if the type of Toy is AF
			else if (object.getType().equals("Action Figure")) {
				
				//add one to figures
				figures++;
			}
		}
		
		//return "Cars" if cars is greater than figures
		if (cars > figures) {
			return "Cars";
		}
		//return "Action Figures" if figures is greater than cars
		else if (figures > cars) {
			return "Action Figures";
		}
		//return "Equal amounts of action figures and cars!" otherwise
		else {
			return "Equal amounts of action figures and cars!";
		}
	}
	//@ return the toyList
	public String toString() {
		return toyList.toString();
	}
}