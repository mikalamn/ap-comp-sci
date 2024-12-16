/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter{
	String role;
	int strength; 
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	public MyCharacter(){
		role = "no role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public MyCharacter(String roleInput){
		if(roleInput.equals("wizard")){
			role = "wizard";
		}
		else if(roleInput.equals("warrior")){
			role = "warrior";
		}
			else if(roleInput.equals("rogue")){
				role = "rogue";
			}
			else{
				role = "no role";
			}
		}
	public void ok(){
		System.out.println("-----------------------------");
		System.out.println("your role is " + role);
		System.out.println("your strength trait is " + strength);
		System.out.println("your dexterity trait is " + dexterity);
		System.out.println("your intelligence trait is " + intelligence);
		System.out.println("your constitution trait is " + constitution);
		System.out.println("your charisma trait is " + charisma);
	}
	}

		
		




