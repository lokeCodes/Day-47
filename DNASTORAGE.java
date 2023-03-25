// https://www.codechef.com/problems/DNASTORAGE
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
            String in = s.next();
            String res = new String();
            char a ='0';
            char b ='1';
            for(int i=0;i<n;i=i+2){
                if(in.charAt(i)==a && in.charAt(i+1)==a){
                    res=res+"A";
                }else if(in.charAt(i)==a && in.charAt(i+1)==b){
                    res=res+"T";
                }else if(in.charAt(i)==b && in.charAt(i+1)==a){
                    res=res+"C";
                }else if((in.charAt(i)==b && in.charAt(i+1)==b)){
                    res=res+"G";
                }
            }
            
            System.out.println(res);
		}
	}
}
