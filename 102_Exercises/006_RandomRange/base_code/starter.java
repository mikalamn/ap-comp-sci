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
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("Please enter another integer (bigger than the first): ");
		int b = sc.nextInt();
		
		System.out.println("Your range is " + a + " to " + b);
		int c = (int)(Math.random()*b-a)+a;
		int d = (int)(Math.random()*b-a)+a;
		int e = (int)(Math.random()*b-a)+a;
		int f = (int)(Math.random()*b-a)+a;
		int g = (int)(Math.random()*b-a)+a;
		
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print(c + ", " + d + ", " + e + ", " + f + ", " + g);
	}
}
