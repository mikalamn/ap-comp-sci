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
		System.out.println("write a sentence! ");
		String sentence = sc.nextLine();
		System.out.println("write a sentence! ");
		String b = sc.nextLine();
		System.out.println(" ");
		System.out.println("This is using the methods!");
		System.out.println(sentence);
		System.out.println(sentence + " " + b);
		
	}
	
	public static void toString(String sentence){
		System.out.print(sentence);
	}
	
	public static void toStringCombined(String b){
		
	}
}
