/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A", "B", "C"};
		String[] suits1 = {"Giraffes", "Lions"};
		int[] pointValues1 = {2,1,6};
		Deck d1 = new Deck(ranks1, suits1, pointValues1);
		System.out.println(d1);
		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
		System.out.println(d1.deal());
		System.out.println(d1);
		
		String[] ranks2 = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits2 = {"Spades", "Clubs", "Diamonds", "Hearts"};
		int[] pointValues2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println(d2);
		System.out.println(d2.isEmpty());
		System.out.println(d2.size());
		System.out.println(d2.deal());
		System.out.println(d2);

		String[] ranks3 = {"Jack"};
		String[] suits3 = {"Spades"};
		int[] pointValues3 = {11}; 
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println(d3);
		System.out.println(d3.isEmpty());
		System.out.println(d3.size());
		System.out.println(d3.deal());
		System.out.println(d3.size());
		System.out.println(d3.isEmpty());
		System.out.println(d3.deal());
		System.out.println(d3);
		
		d2.shuffle();
		System.out.println(d2);
		d2.shuffle();
		System.out.println(d2);
	}
}
