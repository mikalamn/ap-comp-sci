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
	int b, e;
	System.out.print("What is your base number?");
	b = sc.nextInt();
	System.out.print("What is your exponent number?");
	e = sc.nextInt();
	int result = pow(b, e);
	System.out.print("Your answer is: " + result);
		
	
			
	}		
	public static int pow (int x, int y){
		if(y==0){
			return 1;
		}
	int result = 1;
	int count = 0;
	while (count<y){
		result *= x;
		count++;
	}
	return result;
	}

		
}
