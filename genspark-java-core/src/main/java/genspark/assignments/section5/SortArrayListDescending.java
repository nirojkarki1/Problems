package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayListDescending implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
}
