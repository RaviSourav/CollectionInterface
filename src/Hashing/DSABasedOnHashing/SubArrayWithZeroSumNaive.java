package Hashing.DSABasedOnHashing;

public class SubArrayWithZeroSumNaive {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,-5,7,-4,9,-5,8};
        System.out.println(subArray(a));
    }
    static int subArray(int[] a)
    {
        int res=0;
        for (int i=0;i<a.length;i++)
        {
            int sum=0;
            for (int j=i;j<a.length;j++)
            {
                sum+=a[j];
                if (sum==0)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
