import java.io.*;

class PairDifference
{
	static boolean findPair(int arr[],int n)
	{
		int size = arr.length;
		int i = 0, j = 1;

		while (i < size && j < size)
		{
			if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n))
			{
				System.out.print("Pair Found: "+
								"( "+arr[i]+", "+ arr[j]+" )");
				return true;
			}
			else if (arr[j] - arr[i] < n)
				j++;
			else
				i++;
		}

		System.out.print("No such pair");
		return false;
	}

	public static void main (String[] args)
	{
		int arr[] = {1, 8, 30, 40, 100};
		int n = -60;
		findPair(arr,n);
	}
}
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum= 9;
        int low=0;
        int high=n-1;
        while(low<high){
            if(arr[low]+arr[high]>sum){
                high--;
            }else if(arr[low]+arr[high]<sum){
                low++;
            }else if(arr[low]+arr[high]==sum){
                System.out.println(arr[low]+ ","+ arr[high]);
                low++;
                high--;
            }
        }
    }
}   */
