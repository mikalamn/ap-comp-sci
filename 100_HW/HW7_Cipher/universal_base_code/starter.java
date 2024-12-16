/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("please enter a message you want to decipher: ");
String input = sc.nextLine();
System.out.print("please enter a key: ");
int key = sc.nextInt();
System.out.println(Cipher.encode(input));
	System.out.println(Cipher.keyedEncode(input,key));
}
}


