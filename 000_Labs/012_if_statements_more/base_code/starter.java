/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int a = sc.nextInt();
		
		System.out.println("Please enter another integer: ");
		int b = sc.nextInt();
		
		if(a==b){
			System.out.print("Your numbers are the same!");
		}
		
		else if(a!=b){
			System.out.print("Your numbers are different!");
		}
	}
}
