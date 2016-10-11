import java.util.Random;

public class DiceRoll {
	
	public static int playerRoll;
	public static int computerRoll;
	public static String winner;
	public static void main(String[]args) {
		Random randnum = new Random();
		
		playerRoll = randnum.nextInt(6) + 1;
		computerRoll = randnum.nextInt(6) + 1;
		
		rollDice();
		
		System.out.println("You rolled a " + playerRoll + ".");
		System.out.println("Computer rolled a " + computerRoll + ".");
		System.out.println("The winner is " + winner + "!");
		
	}
	public static void rollDice() {
		if (playerRoll > computerRoll) {
			winner = "you";
		}
		if (computerRoll > playerRoll) {
			winner = "computer";
		}
	}
}