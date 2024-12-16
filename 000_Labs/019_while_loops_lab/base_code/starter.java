/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
System.out.print("Please enter a name: ");
String name = sc.nextLine();
System.out.print("How many times would you like this name to be repeated? ");
int number = sc.nextInt();

int start = 0;
while(true) {
	System.out.println(name);
	start++;
	if (start >= (number)){
		break;
	}
}
	

		
	}
}
