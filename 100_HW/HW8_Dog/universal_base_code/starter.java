/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
 Dog firstDog = new Dog("Jeff");
        firstDog.setAge(5);

        Dog secondDog = new Dog("Bob", "Golden Retriever");

        if (firstDog.isSleeping()) {
            System.out.println(firstDog.getName() + " is asleep.");
        } else {
            firstDog.bark();
            if (!secondDog.isSleeping()) {
                secondDog.bark();
            }
        }

        if (secondDog.isSleeping()) {
            System.out.println(secondDog.getName() + " is asleep.");
            if (!firstDog.isSleeping()) {
                firstDog.bark();
            }
        } else {
            System.out.println(secondDog.getName() + " is awake.");
            if (!firstDog.isSleeping()) {
                firstDog.bark();
            }
        }



	}
}
