package Hashing.DSABasedOnHashing;

import java.util.Scanner;

public class SubArrayWithGivenSumNaive {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,1,7,12,4,9,6};
        System.out.println("Enter the sum value:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println(subArray(a,sum));
    }
    static int subArray(int[] a,int sum)
    {
        int res=0,sum_a=0;
        for (int i=0;i<a.length;i++)
        {
            sum_a = 0;
            for (int j=i;j<a.length;j++)
            {
                sum_a+=a[j];
                if (sum_a == sum)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
