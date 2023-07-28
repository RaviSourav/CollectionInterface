package Hashing.DSABasedOnHashing;

import java.util.HashSet;

public class UninOfTwoArrEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,2,1};
        int[] b = new int[]{2,4,6,1};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:a)
            hashSet.add(x);
        for (int x:b)
            hashSet.add(x);
        hashSet.forEach(i-> System.out.print(i+" "));
    }
}
