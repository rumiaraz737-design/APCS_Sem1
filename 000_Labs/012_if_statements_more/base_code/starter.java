/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me your first value please");
		double num = sc.nextDouble();
		System.out.println("Give me your second value please");
		double num2 = sc.nextDouble();
		
		if (num == num2) {
			System.out.println("They are equal ");
			
		} else {
			System.out.println("They are not equal");
		}
	
	}
}
