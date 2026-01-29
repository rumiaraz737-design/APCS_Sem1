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
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		Employee ian = new Employee(6741, "Ian", "Nico", 6767.41);
		ian.employeeToString();
		
		ian.raiseSalary(5);
		Pam.raiseSalary(5);
		Jim.raiseSalary(-67);
		Dwight.raiseSalary(5);
		michael.raiseSalary(5);
		
		ian.getAnnualSalary();
		System.out.println("michaels aunnual and normal after the raise " + michael.getSalary() + "     "+michael.getAnnualSalary());
		System.out.println("Dwights aunnual and normal after the raise " + Dwight.getSalary() + "     "+Dwight.getAnnualSalary());
		System.out.println("Jims aunnual and normal after the raise " + Jim.getSalary() + "    "+Jim.getAnnualSalary());
		System.out.println("Pams aunnual and normal after the raise " + Pam.getSalary() + "    "+Pam.getAnnualSalary());
		System.out.println("Ians aunnual and normal after the raise " + ian.getSalary() + "    "+ian.getAnnualSalary());
		
		
		
	}
}
