/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("what is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You've chosen the Wizard!");
		}
		else if (role.equals("Warrior") || role.equals("warrior")){
		System.out.println("You've chosen the warrior!");
		}
		else if (role.equals("Rogue") || role.equals("rogue")){
		System.out.println("You've chosen the rogue!");
		}
		else{
		System.out.println("You've decided not to chose a role. Rerun program");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		
		if(strength>10){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			strength = sc.nextInt();
		}
		else if (strength >= 0 || strength <= 10){
			System.out.println("You have " + (20 - strength) + " left to spend.");
		}
	
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		
		if (dex>10){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			dex = sc.nextInt();
		}
		else if (dex >= 0 || dex <= 10){
			System.out.println("You have " + (20 - strength - dex) + " left to spend.");
		}
		System.out.print ("Intellegence (1-10): ");
		int intel = sc.nextInt();
		
		if (intel>10){
			System.out.print("Please input a smaller value. Intellegence (1-10): ");
			intel = sc.nextInt();
		}
		else if (intel >= 0 || intel <= 10){
			System.out.println("You have " + (20 - strength - dex - intel) + " left to spend.");
		}
		System.out.print ("Charisma (1-10): ");
		int ris = sc.nextInt();
		
		if (ris>10){
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			ris = sc.nextInt();
		}
		else if (intel >= 0 || intel <= 10){
			System.out.println("You have " + (20 - strength - dex - intel - ris) + " left to spend.");
		}
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + role + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intellegence - " + intel);
		System.out.println("Charisma - " + ris);
		System.out.print("Good luck on your quest, " + name + "!");
		}
		
	}

