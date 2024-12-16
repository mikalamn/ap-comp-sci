/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first name and last name with a space in the middle.");
	String full = sc.nextLine();
	
	int space = full.indexOf(' ');
	String last = full.substring(space + 1);
	System.out.print("The last name is: " + last);



		
	}
}
