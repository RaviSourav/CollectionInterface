package ArrayListConcept;

import java.util.*;

public class ArrayListCommonMethods {
    public static void main(String args[])
    {
        HashMap a = new HashMap<>();
        a.put(1,"a");
        a.put("avc",2.0);
        a.put(1.0,'c');
        System.out.println(a);
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Ravi");
        ar1.add("Rupya");
        ar1.add("Kala");
        ar1.add("Shukla");
        ar1.add("Swati");


        //clone
        ArrayList <String> cloneList = (ArrayList<String>)ar1.clone();
        System.out.println(cloneList);
        System.out.println();

        //contains
        System.out.println(ar1.contains ("python"));
        System.out.println(ar1.contains("c"));
        System.out.println(ar1.contains("Ravi"));
        System.out.println();


        //indexOf and lastIndexOf
        ArrayList<String> list1 = new ArrayList<String> (Arrays.asList("Naveen", "Tom", "Naveen", "Steve", "Lisa", "Samantha"));
        System.out.println(list1);
        System.out.println(ar1.indexOf("ruby")>0);
        System.out.println(ar1.indexOf("Kala")>0);
        int i = list1. lastIndexOf ("Naveen");
        System.out.println(i);
        System.out.println();

        //remove
        list1.remove(1);
        System.out.println(list1);
        list1. remove ("Lisa");
        System.out.println(list1);
        System.out.println();

        //removeIf
        ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays. asList(1,2,3,4,5,6,7,8,9,10));
        numbers. removeIf (num -> num%2 == 0);
        System.out.println(numbers);
        System.out.println();

        //singleton
        ArrayList<String> namesList = new ArrayList<String> (Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Tom"));
        System.out.println(namesList);
        namesList.retainAll(Collections.singleton("Tom"));
        System.out.println(namesList);
        System.out.println();

        //sublist
        ArrayList<Integer> numbers1 = new ArrayList<Integer>
                (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList (2, 6));
        System.out.println(subList);
        System.out.println();

        //convertion to array and String
        ArrayList<String> newList = new ArrayList<String>(
                Arrays.asList("Naveen", "Tom", "Peter" , "Steve", "Lisa", "Robert"));
        Object arr[] = newList.toArray ();
        System.out.println(Arrays.toString(arr));
        for (Object o : arr) {
            System.out.println((String)o);  //String is used to convert to String, it can be removed as well
        }
    }

}
