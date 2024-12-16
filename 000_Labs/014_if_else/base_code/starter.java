/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int a = sc.nextInt();
		int b = (int)(Math.random()*999)+1;
		
		if( a != b){
			System.out.print("Your number wasn't the random number. The number was " + b + ".");
		}
		else if (a == b){
			System.out.print("You guessed the correct number!");
		}
	}
}
