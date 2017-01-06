import java.lang.Math.*;
public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance() {
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int firstX, int firstY, int secondX, int secondY) {
		xOne = firstX;
		yOne = firstY;
		xTwo = secondX;
		yTwo = secondY;
		distance = 0;
	}
	
	public void resetCoordinates() {
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public double calcDistance() {
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	public static void main(String[]args) {
	}
}