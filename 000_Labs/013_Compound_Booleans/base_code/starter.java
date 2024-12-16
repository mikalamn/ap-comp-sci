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
		System.out.print("Please enter your first number: ");
		int a = sc.nextInt();
		
		System.out.print("Please enter your second number: ");
		int b = sc.nextInt();
		
		System.out.print("Please enter your third number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + a + ".");
		}
		else if(b>a && b>c){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " + b + ".");
		}
		else if (c>a && c>b){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + c + ".");
		}
		if (a<b && a <c){
			System.out.println("Your first number is the smallest of the three!");
			System.out.print("The number was " + a + ".");
		}
		else if(b<a && b<c){
			System.out.println("Your second number is the smallest of the three!");
			System.out.print("The number was " + b + ".");
		}
		else if(c<a && c<b){
			System.out.println("Your third number is the smallest of the three!");
			System.out.print("The number was " + c + ".");
			}
		}
}
