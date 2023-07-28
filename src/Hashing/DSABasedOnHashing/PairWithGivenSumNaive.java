package Hashing.DSABasedOnHashing;

import java.util.Scanner;

public class PairWithGivenSumNaive {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,7,12,9,5,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        System.out.println(("Total Pairs in given Array with sum:"+sum+": "+pairSum(a,sum)));
    }
    static int pairSum(int a[],int sum)
    {
        int res = 0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1;j<a.length; j++)
            {
                if(a[i]+a[j] == sum)
                    res++;
            }
        }
        return res;
    }
}
