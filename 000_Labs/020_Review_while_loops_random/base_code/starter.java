/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int guess;
	int target; 
	Scanner sc = new Scanner(System.in);
	
	Random ran = new Random();
	target = ran.nextInt(1000)+1;
	guess = 0;
	
	while(guess != target){
	System.out.print("Enter a number between 1 and 1000: ");
		guess = sc.nextInt();
	
	if (guess < target){
		System.out.println("Too low! Try again.");
	}
	else if (guess > target){
		System.out.println("Too high! Try again.");
	}
	else {
	System.out.print("Congratulations! You've guessed the correct number: " + target);
		}
	
	}
		}
	}
			
	

