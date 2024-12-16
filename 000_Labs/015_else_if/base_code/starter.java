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
		int a = (int)(Math.random()*999)+1;
		
		System.out.print("Pick a number between 1 - 1000: ");
		int b = sc.nextInt();
		
		if ( a > b){
			System.out.print("Your number was smaller than the number. The number was " + a + ".");
		}
		
		else if (a < b){
			System.out.print("Your number was larger than the number. The number was " + a + ".");

		}
	}
}
