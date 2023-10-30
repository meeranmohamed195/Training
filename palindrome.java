
import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int r,sum=0;
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n/=10;
        }
        if(sum==temp){
            System.out.println(temp + " is a palindrome number");
        }else{
            System.out.println(temp +" is not a palindrome number");
        }
    }
}