import java.util.*;
public class Main{
    public static void reverse(char[] str){
        int i=0;
        int j= str.length-1;
        String strr="wehb";
        char c= strr.charAt(i);
        char n=strr.charAt(i);
        while(i<j){
            if(!Character.isAlphabetic(str[i])){
                i++;
            }else if(!Character.isAlphabetic(str[j])){
                j--;
            }else{
                char temp= str[i];
                str[i]=str[j];
                str[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char[] ch= s.toCharArray();
        reverse(ch);
        String nn=new String(ch);
        System.out.println(ch);
        
    }
}