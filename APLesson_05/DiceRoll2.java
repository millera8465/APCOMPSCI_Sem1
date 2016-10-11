public class DiceRoll2 {
	
	//instance variables
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args) {
		int player = (int)(Math.random()*6)+1;
		int computer = (int)(Math.random()*6)+1;
		
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is..." + winner);
	}
	public static String rollDice(int player, int computer){
		if (player > computer) {
			return "Player";
		}
		else if (computer > player) {
			return "Computer";
		}
		else {
			return "It's a tie!";
		}
	}
}