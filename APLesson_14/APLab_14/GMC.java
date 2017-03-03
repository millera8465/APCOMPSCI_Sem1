public class GMC implements Location {
	double xLoc;
	double yLoc;
	int id = (int)(Math.random()*1000000);
	public GMC() {
		xLoc = 0;
		yLoc = 0;
	}
	public GMC(double x, double y) {
		move(x, y);
	}
	public int getID() {
		return id;
	}
	public void move(double x, double y) {
		xLoc += x;
		yLoc += y;
	}
	public double[] getLoc() {
		double[] loc = new double[2];
		loc[0] = xLoc;
		loc[1] = yLoc;
		return loc;
	}
}