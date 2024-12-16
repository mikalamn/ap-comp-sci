/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int number = sc.nextInt();

		System.out.println("Here are the next 5 numbers!");
		System.out.print((number)+", ");
		System.out.print((number+1)+", ");
		System.out.print((number+2)+", ");
		System.out.print((number+3)+", ");
		System.out.print((number+4)+", ");
		System.out.println((number+5));
		
		System.out.println(("Here are the next 5 multiples of " +number)+ "!");
		
		System.out.print((number)+", ");
		System.out.print(((number)+number)+", ");
		System.out.print((((number)+number)+number)+", ");
		System.out.print(((((number)+number)+number)+number)+ ", ");
		System.out.print((((((number)+number)+number)+number)+ number)+ ", ");
		System.out.println(((((((number)+number)+number)+number)+ number)+ number));
		
		double number2=number;
		
		System.out.println(("Here is "+ number2)+" divided by 100!");
		System.out.println(number2/100);
		
		System.out.println(("Here is "+ number2)+" divided by 10!");
		System.out.print(number2/10);


	}
}
