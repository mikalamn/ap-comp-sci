/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]){
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
   Scanner sc = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number: ");
        int max = sc.nextInt();
        prime(max);
    }

    public static boolean Prime(int num){
        if (num < 2){
            return false;
        }
        int divisor = 2;
        while (divisor <= num / 2){
            if (num % divisor == 0){
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void prime(int limit){
        int current = 2;
        while (current <= limit){
            if (Prime(current)){
                System.out.println(current);
            }
            current++;
        }
    }
}
	