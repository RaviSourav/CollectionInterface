package ArrayListConcept;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {
    public static void main(String args[])
    {

        //1. Using Collection
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,2,5,2,7,5,6,7,8,6,9,4,4,4));
        Set<Integer> s = new HashSet<>(ar);
        ArrayList<Integer> arWithoutDuplicate = new ArrayList<>(s);
        System.out.println(arWithoutDuplicate);
        System.out.println();

        //2. Using Lambda function
        List lst = ar.stream().distinct().collect(Collectors.toList());
        System.out.println(lst);
    }
}
