/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength;
	int dex; 
	int intel; 
	int charisma;

public myCharacter(){
		role = "Wizard";
		strength = 3;
		dex = 5;
		intel = 1;
		charisma = 2;
	}
public myCharacter(String r, int s, int d, int i, int c){
		role = r;
		strength = s;
		dex = d;
		intel = i;
		charisma = c;
}
public void printStats(){
	System.out.println(role);
	System.out.println(strength);
	System.out.println(dex);
	System.out.println(intel);
	System.out.println(charisma);
}
	




}