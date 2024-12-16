/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	Random random = new Random();
	int[]array = new int [20];
for (int i = 0; i < array.length; i++){
	array[i] = random.nextInt(10)+1;
}
System.out.print("These are the 20 numbers: ");
for (int i = 0; i < array.length; i++){
	System.out.print(array[i] + " ");
}
System.out.println();

int target = random.nextInt(10)+1;
int [] duplicateIndex = new int [array.length];
int duplicateCount = 0;
for (int i = 0; i < array.length; i++){
	if(array[i] == target){
		duplicateIndex[duplicateCount] = i;
		duplicateCount++;
	}
}
System.out.println("The random number to look for is: " + target);
System.out.println("Total number of duplicates for 5 is: " + duplicateCount);

System.out.println("Looking for two in a row: ");
for(int i = 0; i < array.length - 1; i++){
	if(array[i]==array[i+1]){
		System.out.println("TWo in a row found at indexes " + i + " and " + (i + 1) + ". The number is "+ array[i]);
	}
}

	}
}
