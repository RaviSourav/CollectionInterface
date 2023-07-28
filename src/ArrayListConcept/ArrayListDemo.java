package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList a = new ArrayList();  //Raw type of ArrayList -> can contain any object type variable.
        a.add("Ravi");
        a.add(5);
        a.add(8.0);
        a.add('d');
        System.out.println(a);

        ArrayList ar = new ArrayList(Arrays.asList(a));
        System.out.println(ar);

        ArrayList<Object> arlst = new ArrayList(Arrays.asList(a));
        System.out.println(arlst);
    }
}
