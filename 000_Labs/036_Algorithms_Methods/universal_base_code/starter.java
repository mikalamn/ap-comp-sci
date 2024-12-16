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
int[] randomArray = new int[100];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (i % 100) + 1;
        }

        System.out.println("Array Elements:");
        toStringArray(randomArray);

        int average = getArrayAverage(randomArray);
        System.out.println("Array Average: " + average);

        int max = getArrayMax(randomArray);
        System.out.println("Array Maximum: " + max);

        int min = getArrayMin(randomArray);
        System.out.println("Array Minimum: " + min);
    }

    public static void toStringArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getArrayAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getArrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}