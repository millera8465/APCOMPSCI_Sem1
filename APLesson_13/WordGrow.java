import java.util.Scanner;
public class WordGrow {
	String word;
	public WordGrow() {
		this("");
	}
	public WordGrow(String word) {
		this.word = word;
	}
	public String growWord(String word) {
		while(word.length() > 0) {
			int piece = this.word.length()-(word.length()-1);
			word = word.substring(0, this.word.length()-piece);
			return this.word.substring(0, piece) + "\n" + growWord(word);
		}
		return "";
	}
	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word to grow: ");
		String word = kb.next();
		
		WordGrow shrink = new WordGrow(word);
		System.out.println(shrink.growWord(word));
	}
}