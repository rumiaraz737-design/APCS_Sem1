/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    public BaseClass() {
    }
    
	public void printArr(int[][] arr) {
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
     public void RowAvg(int[][] arr, int row) {
        int sum = 0;
        for(int c = 0; c < arr[row].length; c++) {
            sum += arr[row][c];
        }
        double avg = (double) sum / arr[row].length;
        System.out.println("Avg is " + avg);
    }
     public double sixseven(int[][] arr) {
        int sum = 0;
        int count = 0;
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
                count++;
            }
        }
        return (double) sum / count;
    }
}
