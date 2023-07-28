package Hashing.Chaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingInHashImpl {
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    ChainingInHashImpl(int b)
    {
        this.bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(int key)
    {
        int i = key % bucket;
        table.get(i).add(key);
    }
    int search(int key)
    {
        int i = key % bucket;
        if ((table.get(i).contains(key)))
            return i;
        else
            return -1;
    }

    boolean remove(int key)
    {
        int i = key % bucket;
        return table.get(i).remove((Integer) key);
    }
}
