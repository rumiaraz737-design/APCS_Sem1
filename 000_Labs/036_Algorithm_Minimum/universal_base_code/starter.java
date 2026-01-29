/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int size = (int)(Math.random() * 150) + 51;  
        int[] arr = new int[size];
        
        for(int i =0; i< arr.length ; i++){
        	arr[i] = (int)(Math.random()*100)+1;
        }
        
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int i =0;
         while(i < arr.length){
            int value = arr[i];

            if(value < min){
                min = value;
            }

            if(value > max){
                max = value;
            }

            sum += value;
            i++;
        }


        double a = (double) sum / arr.length;
        
        System.out.println("num of elements " + arr.length);
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("avarage " + a);


		
	}
}