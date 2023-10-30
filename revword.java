import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String str[]=s.split(" ");
        String str1="";
        for(int i=0;i<str.length;i++){
            String word=str[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            str1+=rev+" ";


        }
        System.out.println(str1);
    }
}

//reverse a word by word