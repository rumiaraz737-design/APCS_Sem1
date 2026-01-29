/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = (int)(Math.random() * 1000);
	System.out.println("guess the Number");
	System.out.println(x);
	int num = sc.nextInt();
	if (num == x) {
			System.out.println("Correct");
			
		} else if(num < x) {
			System.out.println("Higher");
		} else if(num > x) {
			System.out.println("lower");
			
			
	
	}
}
}