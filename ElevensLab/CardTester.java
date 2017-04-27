/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card joh = new Card("Jack", "Hearts", 11);
		Card aos = new Card("Ace", "Spades", 1);
		Card aos2 = new Card("Ace", "Spades", 1);
		System.out.println(joh);
		System.out.println(aos);
		System.out.println(joh.matches(aos));
		System.out.println(aos.matches(aos2));
		System.out.println(aos2.pointValue());
		System.out.println(joh.rank());
		System.out.println(aos.suit());
	}
}
