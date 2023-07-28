package Hashing.DSABasedOnHashing;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithGivenSumEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,1,7,12,4,9,6,1,1,1,1};
        System.out.println("Enter the sum value:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println(subArray(a,sum));
    }
    static int subArray(int[] a,int sum)
    {
        int res=0,pre_sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++)
        {
            pre_sum+=a[i];
            if (pre_sum == sum)
                res = i+1;
            if (map.containsKey(pre_sum-sum))
                res = Math.max(res,i-map.get(pre_sum-sum));
            map.put(pre_sum,i);
        }
        return res;
    }
}
