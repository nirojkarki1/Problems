package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListDescending implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        list.get(0);
        Comparator<Integer> c = Collections.reverseOrder();
        list.sort(c);
        return list;
    }
}
