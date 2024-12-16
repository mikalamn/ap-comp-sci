/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf dwarf1 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf2 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf3 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf4 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf5 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf6 = new PooleDwarf(randName(), (int)(Math.random() * 100));
        PooleDwarf dwarf7 = new PooleDwarf(randName(), (int)(Math.random() * 100));

        String firstDwarfName = dwarf1.getName();
        int duplicateCount = 0;

        if (firstDwarfName.equals(dwarf2.getName())) duplicateCount++;
        if (firstDwarfName.equals(dwarf3.getName())) duplicateCount++;
        if (firstDwarfName.equals(dwarf4.getName())) duplicateCount++;
        if (firstDwarfName.equals(dwarf5.getName())) duplicateCount++;
        if (firstDwarfName.equals(dwarf6.getName())) duplicateCount++;
        if (firstDwarfName.equals(dwarf7.getName())) duplicateCount++;

        System.out.println("Duplicate count: " + duplicateCount + ", Name: " + firstDwarfName);
    }
}
		

