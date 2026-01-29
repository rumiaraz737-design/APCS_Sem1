/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int a = sc.nextInt();
	}
	public boolean checkPrime(int a) {
		int x = a;
		int y = x;
		while(x%y!=0){
			y=x-1;
			if(y==1){
				return true;
			}
			}
		return false;
	}
    public void printPrimes(int a){
    	int x = a;
    	while (x>0){
    		checkPrime(x);
    			System.out.print(x);
    		}
    		x = x-1;
    	}
    }

    

