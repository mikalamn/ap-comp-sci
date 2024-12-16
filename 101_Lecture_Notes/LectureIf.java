/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;




class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        boolean x = true;
        boolean y = false;
        
        // boolean can only store true and false, beyond that we can store expressions
        //these act as answers to yes/no questions
        
        boolean z = 5 > 3; //what value does z store?
        boolean a = 3 < 4; // less than
        boolean b = 4 == 4; // equal to
        boolean c = 4 != 5; // NOT equal to
        boolean d = 3 <= 3; // less than or equal to
        boolean e = 5 >= 8; // greater than or equal to
        
        //these are all the expressions we can use for PRIMITIVE DATA ONLY
        // primitive data are foundational blocks of data ( lower case data)
        // int, double, boolean, chear, float, long, etc.
        
        // String is NOT primite because it is made up of char's
        // 'h' + 'e' + 'l' + 'l' + 'o' -> this is equal to "hello"
        // aobve we compare JUST integers.
        
        boolean f = 5.5 != 6.5;
        boolean g = true == false;
        
        // these are used to compare strings
        // FOR STRINGS: NEW METHOD
        
        //.equals();
        boolean h = ("hello").equals("hello");
        
        // strings must use the .equals method to compare. 
        // this does letter by letter comparison till finished or different
        
        // thats it for booleans, they store true or false
        
        // now for if statements, we can start to choose our own adventures! like a book!
        
      //  if(SOME QUESTION)
       // if ( 5 > 3 ){ <- the question or answer goes ehre
                // IF THE CONDITION ABOVE IS TRUE, THIS CODE RUNS
             //   System.out.print("This runs!");
        // }
        
        // else if ()}
        // this would ask another question, not the first
        
        // else has NO value, it catches everything else
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        
        if (num>10){
            System.out.println("Your number is bigger than 10.");
        }
        
        else{
            System.out.print("You number is greater than or equal to 10. ");
        }


        
    }
        
	}
