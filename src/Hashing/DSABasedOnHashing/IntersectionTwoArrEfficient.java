package Hashing.DSABasedOnHashing;

import java.util.HashSet;

public class IntersectionTwoArrEfficient {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,2,1};
        int[] b = new int[]{2,4,6,1};
        HashSet<Integer> hashSet = new HashSet();
        for (int x: a)
            hashSet.add(x);
        HashSet<Integer> result  = new HashSet<>();
        for (int x:b) {
            if (hashSet.contains(x))
            {
                result.add(x);
                hashSet.remove(x);
            }
        }
        System.out.println(hashSet);
        System.out.println(result);
        System.out.println("Intersection of bot arrays are: ");
        result.forEach(i-> System.out.print(i+" "));
    }
}
