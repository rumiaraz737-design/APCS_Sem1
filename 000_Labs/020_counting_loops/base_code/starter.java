/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Say you name");
        String name = sc.nextLine();
        System.out.println("Say a number");
        int y = sc.nextInt();
		int x = 0;
		while(x<=y){
			System.out.println(x + name);
			x = x + 1 ;
		}
		}

}
