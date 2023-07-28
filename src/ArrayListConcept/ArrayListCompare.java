package ArrayListConcept;

import java.util.*;

public class ArrayListCompare {
    public static void main(String args[])
    {
        //1. Sort and then Equals -> sorting because equals matches in order
        ArrayList<String> l1 = new ArrayList<String> (Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<String> (Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<String> (Arrays.asList("B", "A", "C", "D", "F"));
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));//false
        Collections.sort(l3);
        System.out.println(l1.equals (l3));//true
        System.out.println();




        //2. compare two list - find out the additional elements:
        ArrayList<String> l4 = new ArrayList<String> (Arrays.asList ("A", "B", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        l4.removeAll(l5);
        System.out.println(l4);//F
        System.out.println();


        //3. find out the missing elements:
        ArrayList<String> l6 = new ArrayList<String> (Arrays.asList ("A", "B", "C", "D", "F"));
        ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        l7.removeAll(l6);
        System.out.println (l7);//E
        System.out.println();


        //4. find out the common elements:
        ArrayList<String> lang1 = new ArrayList<String> (Arrays.asList("JAVA", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "PHP"));
                lang1.retainAll (lang2);
        System.out.println(lang1);
    }
}
