package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String args[])
    {
        ArrayList<Object> ar = new ArrayList<Object>(20);
        System.out.println(ar.size());
        ar.add(100);
        ar.add(200);
        ar.add(100.0);
        ar.add('c');
        ar.add("Ravi");
        ar.add("String");
        System.out.println(ar.size()+ " " +ar);

        ArrayList<Integer> aint = new ArrayList<>(); //Generic type
        aint.add(100);
        System.out.println(aint);
    }
}
