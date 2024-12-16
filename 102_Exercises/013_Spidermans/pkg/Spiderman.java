package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the Spidermans name?
	int age;			// What's the age of the Spiderman?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of Spiderman/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Spiderman - Unknown, Age - 0, Villain - Unknown
	// String Spiderman constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Spiderman - Unknown, Villain Unknown
	// String Spiderman, int Age constructor! 	Villain Unknown
	// String Spiderman, int Age, String Villain constructor!		
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int b){
		actor = "unknown";
		age = b;
		villain = "unknown";
	}
	public Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "unknown";
	}
	public Spiderman(String a, int b, String c){
		actor = a;
		age = b;
		villain = c;
	}
		public void setAct(String actor){
		this.actor = actor;
	}
	public String getAct(){
		return this.actor;
	}
		public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setVil(String villain){
		this.villain = villain;
	}
	public String getVil(){
		return this.villain;
	}

	
	// ---------------------------------------
	// Create accessor and mutator methods for Spiderman, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
