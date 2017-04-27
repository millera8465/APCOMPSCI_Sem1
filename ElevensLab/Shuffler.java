/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 10;
	private static final int FLIP_COUNT = 10;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Results of " + FLIP_COUNT + " consecutive weighted coin flips:");
		for (int j = 1; j <= FLIP_COUNT; j++) {
			System.out.println(" " + j + ": " + flip());
		}
		
		int[] perms1 = {0, 3, 5, 7, 20};
		int[] perms2 = {0, 5, 2, 3, 20};
		int[] perms3 = {7, 3, 20, 5, 0};

		System.out.println(arePermutations(perms1, perms2));
		System.out.println(arePermutations(perms1, perms3));
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int j = 0; j < values.length/2; j++) {
			shuffled[k] = values[j];
			k+=2;
		}
		k = 1;
		for (int j = values.length/2; j < values.length; j++) {
			shuffled[k] = values[j]; 
			k+=2;
		}
		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to  the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		int r = 0;
		int posk = 0;
		int posr = 0;

		for (int k = values.length-1; k >= 1; k--) {
			r = (int)(Math.random()*(k+1));
			posk = values[k];
			posr = values[r];
			values[k] = posr;
			values[r] = posk;
		}
		
	}
	
	public static String flip() {
		int headsOrTails = (int)(Math.random()*3);
		if (headsOrTails == 0) return "tails";
		return "heads";
	}
	
	public static boolean arePermutations(int[] values1, int[] values2) {
		boolean containsValue = false;
		int similarities = 0;
		if (values1.length == values2.length) {
			for (int j = 0; j < values1.length; j++) {
				for (int i = 0; i < values2.length; i++) {
					if (values2[i] == values1[j]) containsValue = true;
				}
				if (containsValue == true) {
					similarities++;
				}
				containsValue = false;
			}
			if (similarities == values2.length) return true;
		}
		return false;
	}
}
