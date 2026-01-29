/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is ur first val");
		int num = sc.nextInt();
		System.out.println("what is the sseconnd one");
		int num2 = sc.nextInt();
	
		int x = 0;
		int result = 1; 
		while (x < num2){
			result = result * num;
			x = x + 1;
		}

		System.out.println(num + " to the power of" + num2 + "is" + result);
	}
}
