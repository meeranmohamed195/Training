import java.util.*;
import java.lang.*;
import java.io.*;
public class Mee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalnum=n;
        int or=n;
        int result=0,remainder,count=0,remaind;
        while(or>0){
            remaind=or%10;
            or=or/10;
            count++;
        }
        while(originalnum>0){
            remainder=originalnum%10;
            result+=Math.pow(remainder,count);
            originalnum/=10;
        }
        //System.out.println(result);
        if(n==result){
            System.out.println(n +" is a armstrong number");
        }else{
            System.out.println(n +" is not a armstrong number");
        }
    }
}