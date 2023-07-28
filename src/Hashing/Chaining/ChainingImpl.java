package Hashing.Chaining;

import java.util.LinkedList;

public class ChainingImpl {
    public static void main(String[] args) {
        ChainingInHashImpl chainingInHash = new ChainingInHashImpl(7);
        chainingInHash.insert(32);
        chainingInHash.insert(43);
        chainingInHash.insert(31);
        chainingInHash.insert(41);
        chainingInHash.insert(30);
        chainingInHash.insert(40);
        chainingInHash.insert(21);
        chainingInHash.insert(35);

        System.out.println(chainingInHash.table);
        for (LinkedList<Integer> ch:chainingInHash.table) {
            System.out.println(ch);
        }

        System.out.println(chainingInHash.remove(30));
        System.out.println(chainingInHash.remove(6));
        System.out.println(chainingInHash.search(30));
        System.out.println(chainingInHash.search(6));
        System.out.println(chainingInHash.search(40));


    }
}
