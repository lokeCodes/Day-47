// https://www.codechef.com/problems/WORDLE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    String a1 = s.next();
		    String a2 = s.next();
            
            for(int i=0;i<5;i++){
                if(a1.charAt(i)==a2.charAt(i)){
                    System.out.print("G");
                }else{
                    System.out.print("B");
                }
            }
		    System.out.println();
		}
		
	}
}
