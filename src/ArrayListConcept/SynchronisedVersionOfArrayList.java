package ArrayListConcept;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedVersionOfArrayList {
    public static void main(String args[])
    {
        //1. synchronizedList version of ArrayList
        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("Ravi");
        nameList.add("Kala");
        nameList.add("RUpya");
        nameList.add("Shukla");
        //add, remove -> we don't need explicit Synchronization
        //to fetch/traverse the values from the list we have ro use explicit Synchronization

        synchronized (nameList)
        {
            Iterator<String> itr = nameList.iterator();
            while (itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
        System.out.println();

        //2. CopyOnWriteArrayList version of ArrayList -> It's a class Thread Safe/synchronized already
        CopyOnWriteArrayList<String> clist = new CopyOnWriteArrayList<String>();
        clist.add("Ravi");
        clist.add("Kala");
        clist.add("RUpya");
        clist.add("Shukla");
        //We don't need Explicit Synchronization of any operation -> add/remove/traverse
        Iterator<String> itr = clist.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
