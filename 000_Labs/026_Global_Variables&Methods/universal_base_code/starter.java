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
	System.out.println("what class do you want to be?");
	Scanner sc = new Scanner(System.in);
	String c = sc.nextLine();
	
	MyCharacter idk = new MyCharacter(c);
	idk.ok();


		
	}
}
