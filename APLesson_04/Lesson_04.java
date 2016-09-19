public class Lesson_04 {
	public static void main(String[] args) {
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaaah";
		double number1 = 45544.3453;
		
		form.format(word1, number1);
		
		String word2 = "yesssss";
		double number2 = 2342.4129;
		form.format(word2, number2);
		
	}
	
	public void format(String word, double number) {
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}