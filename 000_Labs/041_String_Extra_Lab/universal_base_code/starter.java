/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
 public static String reverseWords(String phrase) {
        String result = "";
        String word = "";

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.substring(i, i + 1).equals(" ")) {
                if (word != "") {
                    if (result != "") {
                        result = word + " " + result;
                    } else {
                        result = word;
                    }
                    word = "";
                }
            } else {
                word = word + phrase.substring(i, i + 1);
            }
        }

        if (word != "") {
            if (result != "") {
                result = word + " " + result;
            } else {
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String phrase = scanner.nextLine();
		String reversed = reverseWords(phrase);
	    System.out.println(reversed);

    }
}