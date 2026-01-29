/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] song = new int[1000];
		int six = 0; 
		int x = 0;
		int y = 0;
		int z =3;
		while (x < song.length) { 
            song[y] = z;
            System.out.print(song[six] + " ");
            x = x + 1;
            six = six + 1;
            y =y+1;
            z =z+3;
        }   System.out.println();
	
	    int[] down = new int[1000];
		int seven = 0; 
		int r = 0;
		int p = 0;
		int f =1000;
		while (r < down.length){
            down[p] = f;
            System.out.print(down[seven] + " ");
            r = r+1;
            seven = seven + 1;
            p = p+1;
            f = f-1;
        }
	}
}

