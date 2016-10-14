import java.util.Scanner;
public class Adventure {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String choice1 = "";
		String choice2 = "";
		String choice3 = "";
		//choice 1 main
		System.out.println("While walking through an ancient temple, you have come across a statue " +
							"with a large stone button in front of it. \nWhat do you do?" +
							"\nA. Press the button." + 
							"\nB. Walk around the statue and look at the back." +
							"\nC. Throw a rock at the statue.");
		choice1 = keyboard.next();
		if (choice1.equals("B")) {
			//main choice 2
			System.out.println("As you walk around the statue, you notice a hidden series of darts ready to shoot out." +
								"\nOh no! A dragon has appeared! What do you do now?" +
								"\nA. Say hi. Maybe it's a friendly dragon?" +
								"\nB. Curse at it, mocking its apparent weakness." +
								"\nC. Throw your sword at it.");
			choice2 = keyboard.next();
			if (choice2.equals("A")) {
				//main choice 3 main
				System.out.println("It is friendly! It smiles at you and walks away. What do you do now?" +
									"\nA. Chase the dragon" + 
									"\nB. Continue exploring" + 
									"\nC. Go home.");
				choice3 = keyboard.next();
				if (choice3.equals("A")) {
					//main end A
					System.out.println("You fight valiently, but eventually the dragon slays you. You have died!");
				}
				else if (choice3.equals("B")) {
					//main end B
					System.out.println("You find an old magical artifact. You are rich!");
				}
				else {
					// main end C
					System.out.println("You return safely. You aren't a hero, but at least you aren't dead!");
				}
			}
			else {
				//main choice 3 alt
				System.out.println("Bad choice! The dragon, angered, breathes fire upon you." +
				"\nWhat do you do now in your badly burnt state?" +
				"\nA. Curse at the dragon!" + 
				"\nB. Crawl away and treat your wounds." +
				"\nC. Cry and wait to die.");
				choice3 = keyboard.next();
				if (choice3.equals("B")) {
					//main alt end correct
					System.out.println("You survive, due to your expert medical skills!");
				}
				else {
					//main alt end wrong
					System.out.println("A bad decision. You have died!");
				}
			}
		}
		else {
			//alt choice 2
			System.out.println("A series of darts shoot out of the statue's eyes!" +
			"\nYou are now gravely wounded. What do you do?" +
			"\nA. Try to leave the temple and return to safety" + 
			"\nB. Call for help." +
			"\nC. Use your first aid kit to treat your wounds.");
			choice2 = keyboard.next();
			if (choice2.equals("C")) {
				//alt choice 3 main
				System.out.println("You have successfully been healed!" +
						"\nWhat will you do now?" +
						"\nA. Return home." +
						"\nB. Continue exploring the temple." +
						"\nC. Go back and study the mechanics of the statue.");
				choice3 = keyboard.next();
				if (choice3.equals("A")) {
					//alt main end A
					System.out.println("You have safely returned home. Be sure to go to a hospital!");
				}
				else if (choice3.equals("B")) {
					//alt main end B
					System.out.println("You have found an ancient magical artifact, making you wealthy and famous!");
				}
				else {
					//alt main end C
					System.out.println("As you study the statue, you accidentally touch a lever." +
										"\nYou have been shot by a dart! You have died!");
				}
			}
			else {
				//alt choice 3 alt
				System.out.println("Your atttempts at surviving on your own have proved futile. What do you do?" +
									"\nA. Cry as the pain overwhelms you." +
									"\nB. Throw rocks at the statue in frustration." +
									"\nC. Treat your wounds using your first aid kit.");
				choice3 = keyboard.next();
				if (choice3.equals("C")) {
					//alt alt end correct
					System.out.println("After healing your injuries successfully, you return home with stories to tell.");
				}
				else {
					//alt alt end wrong
					System.out.println("Your failure to treat your wounds has resulted in your death.");
				}
			}
		}
	}
}
