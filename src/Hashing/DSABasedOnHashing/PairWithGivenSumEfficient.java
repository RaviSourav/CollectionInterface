package Hashing.DSABasedOnHashing;

import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSumEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,8,12,9,5,1,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        System.out.println(("Total Pairs in gievn Array with sum:"+sum+": "+pairSum(a,sum)));
    }

    //not counting duplicate pairs
    public static int pairSum(int[] a,int sum)
    {
        int res = 0;
//        List<Integer> arrayList = Arrays.stream(a).boxed().toList();//Java 16 feature
//        arrayList.forEach(i-> System.out.print(i+" "));
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:a) {
            if(hashSet.contains(sum-x))
                res++;
            else
                hashSet.add(x);
        }
        return res;
    }

    //This can also be done using ArrayList but time complexity will not be efficient
//    public static int pairSum(int[] a,int sum)
//    {
//        int res = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int x:a) {
//            if(arrayList.contains(sum-x))
//                res++;
//            else
//                arrayList.add(x);
//        }
//        return res;
//    }
}
