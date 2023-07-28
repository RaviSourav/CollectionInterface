package Hashing.DSABasedOnHashing;

import java.util.ArrayList;
import java.util.Iterator;

public class UnionOfTwoArrNaive {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,2,1};
        int[] b = new int[]{2,4,6,1};
        ArrayList<Integer> arrayList = new ArrayList();
        for (int x: a)
        {
            if (!arrayList.contains(x))
                arrayList.add(x);
        }
        for (int x: b)
        {
            if (!arrayList.contains(x))
                arrayList.add(x);
        }
        arrayList.forEach(i-> System.out.print(i+" "));
        System.out.println();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");

    }
}
