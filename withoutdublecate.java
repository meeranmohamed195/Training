import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        Set hash_set=new HashSet();
        for(int j=0;j<arr.length-1;j++){
            hash_set.add(arr[j]);
        }
        System.out.println(hash_set);
    }
}


//remove dublicate