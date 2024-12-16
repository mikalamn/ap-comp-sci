/*
   * Author:
   * Date:
   * Collaborator(s): RYAN YOON
*/
import java.util.Scanner;

class Starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String a = toSentence(sentence);
        
        System.out.println("Here's your sentence in Pig Latin: ");
        System.out.println(a);
    }
    
    public static String toWord(String x) {
        String vowels = "aAeEiIoOuU";
        String finalWord = "";
        int findVowel = -1;
        
        if (vowels.contains(x.substring(0, 1))) {
            finalWord = x + "-way"; // 
        } else {
            for (int i = 0; i < x.length(); i++) {
                if (vowels.contains(x.substring(i, i + 1))) {
                    findVowel = i;
                    break;
                }
            }
            
            if (findVowel != -1) {
                finalWord = x.substring(findVowel) + "-" + x.substring(0, findVowel) + "ay";
            } else {
                finalWord = x + "ay"; 
            }
        }
        
        return finalWord;
    }

    public static String toSentence(String sentence) {
        String x = "";
        String finalSentence = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            String letter = sentence.substring(i, i + 1);
            
            if (!letter.equals(" ")) {
                x += letter; 
            } else {
              
                if (!x.isEmpty()) {
                    finalSentence += toWord(x) + " ";
                    x = ""; 
                }
            }
        }
        
    
        if (!x.isEmpty()) {
            finalSentence += toWord(x);
        }
        
        return finalSentence;
    }
}
