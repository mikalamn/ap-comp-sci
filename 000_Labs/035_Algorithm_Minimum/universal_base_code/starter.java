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
		Random ran = new Random();
		int arraySize = ran.nextInt(150)+51;
		int [] arr = new int[arraySize];
		for(int i = 0; i<arr.length; i++){
			arr[i] = ran.nextInt(100)+1;
		}
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		
		for(int num : arr){
			if(num<min)min = num;
			if(num>min)max = num;
			sum+=num;
		}
		double average = (double)sum/arr.length;
		System.out.println("min value: " + min);
		System.out.println("max value: " + max);
		System.out.println("avg value: " + average);

		
	}
}
