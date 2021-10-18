package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Collections.reverse(list);
        return list;
    }
}
