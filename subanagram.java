/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//sub anagram cdechef

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int fre[]=new int[26];
		Arrays.fill(fre,Integer.MAX_VALUE);
		while(n-->0){
		    String s=br.readLine();
		for(int i=0;i<26;i++){
		    int count=0;
		    for(int j=0;j<s.length();j++){
		        if(s.charAt(j)-'a'==i){
		            count++;
		        }
		    }
		        fre[i]=Math.min(fre[i],count);
		}
		}
		String word="";
		for(int i=0;i<26;i++){
		    while(fre[i]-->0){
		    int temp='a'+i;
		    char ch=(char)temp;
		    word=word+(ch);
		    }
		}
		if(word.length()==0) System.out.println("no such string");
		else System.out.println(word);
	}
}


