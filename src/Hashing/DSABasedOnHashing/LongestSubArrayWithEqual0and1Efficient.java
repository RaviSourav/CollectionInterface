package Hashing.DSABasedOnHashing;

import java.util.HashMap;

public class LongestSubArrayWithEqual0and1Efficient {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 0,1, 1, 1};
        System.out.println(subArray(arr));
    }
    static int subArray(int[] a)
    {
        int res=0;
        for (int i=0;i<a.length;i++)
            a[i] = (a[i]==0)?-1:1;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int pre_sum=0;
        for (int i=0;i<a.length;i++)
        {
            pre_sum+=a[i];
            if(pre_sum==0)
                res = i+1;
            if (hashMap.containsKey(pre_sum))
                res = Math.max(res,i- hashMap.get(pre_sum));
            else
                hashMap.put(pre_sum,i);
        }
        return res;
    }
}
