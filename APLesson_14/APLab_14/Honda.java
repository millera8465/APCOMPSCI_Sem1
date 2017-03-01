public class Honda implements Location {
	public double xLoc;
	public double yLoc;
	public int id = (int)(Math.random()*1000000);
	public Honda() {
		xLoc = 0;
		yLoc = 0;
	}
	public Honda(double[] xy) {
		move(xy);
	}
	public int getID() {
		return id;
	}
	public void move(double[] xy) {
		xLoc = xy[0];
		yLoc = xy[1];
	}
	public double[] getLoc() {
		double[] loc = new double[2];
		loc[0] = xLoc;
		loc[1] = yLoc;
		return loc;
	}
}