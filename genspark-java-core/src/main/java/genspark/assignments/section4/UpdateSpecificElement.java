package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class UpdateSpecificElement implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(index < list.size() && index >= 0) {
            list.set(index, val);
            return list;
        }
        return list;
    }
}
