/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int example = 0;
	public String role = new String (" ");
	
	public myCharacter(){
		role = "no role";
	}
	public myCharacter(String roleInput){
		if(roleInput.equals("Wizard")){
			role = "Wizard";
		}
		else if(roleInput.equals("Warrior")){
			role = "Warrior";
		}
		else if(roleInput.equals("Rogue")){
			role = "Rogue";
		}
		else{
			role = "no role";
		}
	}
		
	}



