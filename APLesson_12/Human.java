public class Human {
	//Instance variables
	private String hair, eyes, skin;
	
	//default Constructor
	public Human() {
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//Constructor with params
	public Human(String h, String e, String s) {
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Modifier
	public void setHES(String h, String e, String s) {
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessors
	public String getHair() {
		return hair;
	}
	public String getEyes() {
		return eyes;
	}
	public String getSkin() {
		return skin;
	}
}