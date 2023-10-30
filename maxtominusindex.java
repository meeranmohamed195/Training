//arr sum then minus max

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
            sum +=arr[i];
        }//System.out.println(sum);
        Arrays.sort(arr);
        for(int j=n-1;j>0;j--){
            sum-=arr[j];
        }
        System.out.println(sum);
        
    }
}