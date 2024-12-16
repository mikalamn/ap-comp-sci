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
	System.out.println("Enter your pet peeve: ");
	String petPeeve = sc.nextLine();
	String a = "Did you just say ";
	String b = " is your pet peeve? \n Wow how dare you.";
	String d = "Get out of here!";
	
	System.out.print(a + petPeeve + b + d);

		
	}
}
