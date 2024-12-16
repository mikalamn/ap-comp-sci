/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

         int total= 100;
        boolean play = true;

        System.out.println("Slot Machine Rules:");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your money.");
        System.out.println("   b. If three numbers match, you triple your money.");
        System.out.println("   c. If none match, you lose your money.");
        System.out.println("--------------------------------------------------");

        while (play && total > 0) {
            System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
            String input = sc.nextLine();

            if (input.equals("yes") || input.equals("Yes") || input.equals("y") || input.equals("Y")) {
                int wager = 0;
                while (true) {
                    System.out.println("You have $" + total + ". How much would you like to wager?");
                    wager = sc.nextInt();
                    sc.nextLine();

                    if (wager > 0 && wager <= total) {
                        break;
                    } else {
                        System.out.println("Invalid wager. Please enter a value less than or equal to your total money.");
                    }
                }

                int roll1 = random.nextInt(10) + 1;
                int roll2 = random.nextInt(10) + 1;
                int roll3 = random.nextInt(10) + 1;

                System.out.println("Great! Let's play!!!");
                System.out.println("Your rolls are:");
                System.out.println("-----------------------");
                System.out.printf(" | %d | %d | %d |\n", roll1, roll2, roll3);
                System.out.println("-----------------------");

                if (roll1 == roll2 && roll2 == roll3) {
                    total += wager * 2;
                    System.out.println("Jackpot! You tripled your money!");
                } else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
                    total += wager;
                    System.out.println("You won! You doubled your money!");
                } else {
                    total -= wager;
                    System.out.println("Didn't win this time, better luck next time!");
                }

                System.out.println("You now have $" + total + ".");

                if (total <= 0) {
                    System.out.println("You've run out of money! Game over.");
                    break;
                }
            } else if (input.equals("no") || input.equals("No")) {
                play = false;
            } else {
                System.out.println("That wasn't quite the correct answer. Try again.");
            }
        }

        if (total > 0) {
            System.out.println("Thank you for playing! You leave with $" + total + ".");
        }

    
    }
}

	

