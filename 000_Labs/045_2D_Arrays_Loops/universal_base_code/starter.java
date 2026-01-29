/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows would you like in ur array");
		int x = sc.nextInt();
		System.out.println("How many collums would you like in ur array");
		int y = sc.nextInt();
		int[][] arr = new int[x][y];
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++)
			arr[r][c] = (int)(Math.random() * 10) + 1;
		}
		BaseClass bc = new BaseClass();
		System.out.println("Here is your 2D array:");
        bc.printArr(arr);
		System.out.println("What row would you like to get the avg of?");
		int row = sc.nextInt();
		bc.RowAvg(arr, row);
        System.out.println("Average of all values: " + bc.sixseven(arr));
        


		
	}
}
