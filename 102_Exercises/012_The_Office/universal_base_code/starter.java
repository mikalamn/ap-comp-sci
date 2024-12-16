/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
				michael.raiseSalary(30);
			michael.getAnnualSalary();
			System.out.println(michael.getAnnualSalary());
		michael.employeeToString();
	
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(15);
		dwight.getAnnualSalary();
		System.out.println(dwight.getAnnualSalary());
		dwight.employeeToString();
		
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(12);
		jim.getAnnualSalary();
		System.out.print(jim.getAnnualSalary());
		jim.employeeToString();
		
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(21);
		pam.getAnnualSalary();
		System.out.print(pam.getAnnualSalary());
		pam.employeeToString();
		
		Employee bob = new Employee(1111, "bob", "smith", 2250);
		bob.raiseSalary(14);
		bob.getAnnualSalary();
		System.out.print(bob.getAnnualSalary());
		bob.employeeToString();
		
		
		}
		
}
