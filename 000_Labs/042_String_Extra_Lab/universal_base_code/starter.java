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
        System.out.println("enter a sentence of which you would like to be reversed");
        String a = sc.nextLine();

        String reversed = "";
        int end = a.length();
        int space = 0;
        String word = "";

        while(end > 0) {
            space = a.lastIndexOf(" ", end - 1);
            if(space == -1) {
                word = a.substring(0, end);
            } else {
                word = a.substring(space + 1, end);
            }
            reversed = reversed + word + " ";
            end = space;
        }

 

        System.out.println(reversed);
    }
}
