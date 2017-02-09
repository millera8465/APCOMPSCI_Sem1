public class GameSystem {
	private String platform;
	private int serialNo;
	
	public GameSystem() {
		this.platform = "";
		this.serialNo = (int)(Math.random()*10000000);
	}
	public GameSystem(String p) {
		this.platform = p;
		this.serialNo = (int)(Math.random()*10000000);
	}
	
	public String getPlatform() {
		return platform;
	}
	public int getSerialNo() {
		return serialNo;
	}
}