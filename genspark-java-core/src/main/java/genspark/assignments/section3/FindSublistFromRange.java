package genspark.assignments.section3;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (elms.isEmpty()){
            return new ArrayList<>();
        }
        return new ArrayList<>(elms.subList(from, to));
    }
}
