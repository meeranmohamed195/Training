import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int count=0;
        for(int i =0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                System.out.print(ch[i]);
            }
            else{
                int a = Integer.parseInt(String.valueOf(ch[i]));
                count +=a;
            }
        }
        System.out.print(count);
        
    }
}