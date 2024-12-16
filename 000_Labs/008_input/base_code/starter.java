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
		
		System.out.println("what is your first name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		
		System.out.println("What day were you born? (1-31)");
		int date = sc.nextInt();

		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money = sc.nextDouble();
		
		System.out.print((("Your name is ")+ name) + " and you were born on ");
		System.out.println(month+"/"+ date+"/"+ year+".");
		System.out.println("You are "+ age +" years old!!!");
		System.out.print("You have $" + money + " in your wallet.");
		
	}
}
