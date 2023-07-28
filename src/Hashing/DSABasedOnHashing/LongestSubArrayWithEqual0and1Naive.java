package Hashing.DSABasedOnHashing;

public class LongestSubArrayWithEqual0and1Naive {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1,0,0};
        System.out.println(subArray(arr));
    }
    static int subArray(int[] a)
    {
        int res=0;
        for (int i=0;i<a.length;i++)
        {
            int count_1=0,count_0=0;
            for (int j=i;j<a.length;j++)
            {
                if (a[j]==0)
                    count_0++;
                else
                    count_1++;
                if (count_1 == count_0)
                    res = Math.max(res,j-i+1);
            }
        }
        return res;
    }
}
