public class Toyota implements Location {
	double[] location;
	int id = (int)(Math.random()*1000000);
	public Toyota() {
		location = new double[2];
	}
	public Toyota(String l) {
		location = new double [2];
		String[] locs = l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
	public int getID() {
		return id;
	}
	public void move(double x, double y) {
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc() {
		double[] loc = location;
		return loc;
	}
}