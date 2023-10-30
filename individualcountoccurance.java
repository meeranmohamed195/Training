//individual char occurance
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String uni="";
        int i,j,count;
        for(i=0;i<s.length();i++) {
            count=0;
            for (j = 0; j <=i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uni = uni + s.charAt(i);
            }
        }
        for(i=0;i<uni.length();i++){
            count=0;
            for(j=0;j<s.length();j++){
                if(uni.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(uni.charAt(i));
            }else{
                System.out.printf("%c%d",uni.charAt(i),count);
            }
        }

    }
}