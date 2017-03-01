public class Toyota implements Location {
	public double xLoc;
	public double yLoc;
	public int id = (int)(Math.random()*1000000);
	public Toyota() {
		xLoc = 0;
		yLoc = 0;
	}
	public Toyota(String xy) {
		move(xy);
	}
	public int getID() {
		return id;
	}
	public void move(String xy) {
		xLoc = Double.parseDouble(xy.substring(0,xy.indexOf(",")));
		yLoc = Double.parseDouble(xy.substring(xy.indexOf(",")+2));
	}
	public double[] getLoc() {
		double[] loc = new double[2];
		loc[0] = xLoc;
		loc[1] = yLoc;
		return loc;
	}
}