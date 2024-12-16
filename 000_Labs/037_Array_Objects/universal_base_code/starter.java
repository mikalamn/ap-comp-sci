/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
 Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1));
            wizards[i] = new Wizard("Wizard " + (i + 1));
        }

        int warriorIndex = 0;
        int wizardIndex = 0;

        while (warriorIndex < 100 && wizardIndex < 100) {
            if (!wizards[wizardIndex].isDead()) {
                wizards[wizardIndex].attack(warriors[warriorIndex]);

                if (warriors[warriorIndex].isDead()) {
                    warriorIndex++;
                }
            }

            if (!warriors[warriorIndex].isDead()) {
                warriors[warriorIndex].attack(wizards[wizardIndex]);

                if (wizards[wizardIndex].isDead()) {
                    wizardIndex++;
                }
            }
        }

        if (warriorIndex < 100) {
            System.out.println("Warriors won with " + (100 - warriorIndex) + " left in their army.");
        } else {
            System.out.println("Wizards won with " + (100 - wizardIndex) + " left in their army.");
        }
    }
}