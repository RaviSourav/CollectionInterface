package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String args[])
    {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Ravi");
        ar.add("Rupya");
        ar.add("Kala");
        ar.add("Shukla");
        ar.add("Swati");

        //1st Method using for loop
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));
        System.out.println();

        //2nd Method using For each loop
        for(String str: ar)
            System.out.println(str);
        System.out.println();

        //3rd Method using Stream (Java 8 Feature)
        ar.stream().forEach(ele ->  System.out.println(ele));
        System.out.println();

        //4th Method using Iterator
        Iterator<String> itr = ar.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
