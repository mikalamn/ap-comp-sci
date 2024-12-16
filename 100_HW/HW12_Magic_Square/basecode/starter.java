import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Please enter how many magic squares you want to see: ");

        int numberOfSquares = sc.nextInt();
  
        CVMath.specialSquare(numberOfSquares); 

    }
}
