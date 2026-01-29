/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String[] song;
		song = new String[10];
		int six = 0; 
		int x = 0;
		song[0] = "The wheels on the bus go 'round and 'round";
		song[1] = "'Round and 'round, 'round and 'round";
		song[2] = "The wheels on the bus go 'round and 'round";
		song[3] = "All through the town";
		song[4] = "The doors on the bus go open and shut";
		song[5] = "Open and shut, open and shut";
		song[6] = "The doors on the bus go open and shut";
		song[7] = "All through the town";
		song[8] = "The wipers on the bus go swish, swish, swish";
		song[9] = "Swish, swish, swish, swish, swish, swish";
		
		while(x<song.length){
			System.out.println(song[six]);
			x= x+1;
			six= six+1;
		}
		
		


		
	}
}
