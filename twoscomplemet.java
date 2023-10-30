import java.util.*;
public class Main{
    public static char flip(char c) {
        return (c == '0') ? '1' : '0';
    }
    public static String twocomp(String s){
        String ones="",twos="";
        for(int i=0;i<s.length();i++){
            ones+=flip(s.charAt(i));
        }
        int number0 = Integer.parseInt(ones, 2);
        Boolean b = false;
        StringBuilder builder= new StringBuilder(ones);
        for(int j=ones.length()-1;j>0;j--){
            if (ones.charAt(j) == '1') {
                builder.setCharAt(j,'0');

            }else{
                builder.setCharAt(j,'1');

                b=true;
                break;
            }
        }if(!b){
            builder.append("1",0,7);
        }
        twos=builder.toString();
        return twos;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();

        System.out.println(twocomp(n));

    }
}