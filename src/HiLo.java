import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// Create a random number for the user to guess
			int theNumber = (int)(Math.random() * 100 + 1);
			//System.out.println( theNumber );
			int guess = 0;
			int tries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();
				tries++;
				if (guess < theNumber) 
					System.out.println(guess + " is too low, try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high, try again.");
				else 
					System.out.println(guess + " is correct. You win.");
			}
			System.out.println("It only took you " + tries + " tries.");
			System.out.println("Do you want to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}

}
