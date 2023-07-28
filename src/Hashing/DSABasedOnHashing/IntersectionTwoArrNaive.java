package Hashing.DSABasedOnHashing;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionTwoArrNaive {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,2,1};
        int[] b = new int[]{2,4,6,1};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                if (a[i] == b[j])
                    hashSet.add(a[i]);
            }
        }
        System.out.println(hashSet);
        for (int h:hashSet) {
            System.out.print(h+" ");
        }
        System.out.println();
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        hashSet.forEach(System.out::println);
        hashSet.forEach(i-> System.out.print(i+" "));
    }
}
