/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			double a = Math.max(13 - 6 * 11, 30 % 7 * (-2));
			System.out.println("Maximum =" + a);
			double b = Math.sqrt(3 * 8 + 31 % 7);
			System.out.println("Square root = " + b);
			double c = Math.pow(37 / 3, 35 % 21);
			System.out.println("Power = " + c);
			double d = Math.max(Math.pow( 2,14%3) ,Math.sqrt( 2*6) );
			System.out.println("Max = " + d);
		//extra 
		
		System.out.println("Give me your first value please");
		double num = sc.nextDouble();
		System.out.println("Give me your second value please");
		double num2 = sc.nextDouble();
		
			double a2 = Math.max(num,num2);
			System.out.println("Maximum of both =" + a2);
			double b2 = Math.sqrt(num2);
			System.out.println("Square root of your second value = " + b2);
			double c2 = Math.pow(num,num2);
			System.out.println("first value to the second palue power = " + c2);
		
		
		
		
		
	}
}
