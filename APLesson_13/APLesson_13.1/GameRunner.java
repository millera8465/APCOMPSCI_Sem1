public class GameRunner {
	public static void main(String[]args) {
		XBox xb = new XBox("XBox");
		PlayStation ps = new PlayStation("PlayStation");
		PC comp = new PC("PC");
		PlayStation ps2 = new PlayStation("PlayStation");
		System.out.println();
		System.out.println(xb);
		System.out.println();
		System.out.println(ps);
		System.out.println();
		System.out.println(comp);
		System.out.println();
		System.out.println(ps2);
		System.out.println();
	}
}