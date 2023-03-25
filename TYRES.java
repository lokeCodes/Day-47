// https://www.codechef.com/problems/TYRES
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
		    int n = s.nextInt();
		    if(n%4==0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}
