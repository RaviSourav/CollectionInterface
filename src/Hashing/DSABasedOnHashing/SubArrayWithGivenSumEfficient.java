package Hashing.DSABasedOnHashing;

import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithGivenSumEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,1,7,12,4,9,6};
        System.out.println("Enter the sum value:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println(subArray(a,sum));
    }
    static int subArray(int[] a,int sum)
    {
        int pre_sum=0;
        int res=0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<a.length;i++)
        {
            pre_sum+=a[i];
            if(pre_sum == sum)
                res++;
            if (hashSet.contains(pre_sum-sum))
                res++;
            hashSet.add(pre_sum);
        }
        return res;
    }
}
