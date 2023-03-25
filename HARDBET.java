// https://www.codechef.com/problems/HARDBET
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int res = Math.min(a,Math.min(b,c));
		    if(res==a){
		        System.out.println("Draw");
		    }else if(res==b){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Alice");
		    }
		}
	}
}
