package Hashing.DSABasedOnHashing;

import java.util.HashSet;

public class SubArrayWithZeroSumEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,-5,7,-4,9,-5,8};
        System.out.println(subArray(a));
    }
    static int subArray(int[] a)
    {
        int res=0;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(a[0]);
        int pre_sum=a[0];
        for (int i=1;i<a.length;i++)
        {
            pre_sum+=a[i];
            if (hashSet.contains(pre_sum))
                res++;
            else
                hashSet.add(pre_sum);
        }
        return res;
    }
}
