// https://www.codechef.com/problems/CREDITS
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
		    int x = s.nextInt();
		    if(x>65){
		        System.out.println("Overload");
		    }else if(x<35){
		        System.out.println("Underload");
		    }else{
		        System.out.println("Normal");
		    }
		}
	}
}
