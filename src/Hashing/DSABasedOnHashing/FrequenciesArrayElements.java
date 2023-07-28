package Hashing.DSABasedOnHashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,1,2,6,4,6,8,9,5,6};
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int x: arr)
            linkedHashMap.put(x,linkedHashMap.getOrDefault(x,0)+1);
        System.out.println(linkedHashMap);
        for (Map.Entry<Integer,Integer> l:linkedHashMap.entrySet()) {
            System.out.print("Element "+l.getKey()+" appeared: "+l.getValue()+" times\n");
        }
    }
}
