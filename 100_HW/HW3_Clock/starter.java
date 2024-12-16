/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day of the week (0-6): ");
		
		int b = sc.nextInt();
		
		if(b == 0 || b == 6){
		System.out.print("It's the weekend! It's 10 AM!");
		}
		
		else if(b >= 1 && b <= 5){
		System.out.print("Wake up, it's a weekday! It's 7AM!");
		}
		
		else{
		System.out.print("Invalid value. Please enter an integer from 0 to 6.");
		}
}
}