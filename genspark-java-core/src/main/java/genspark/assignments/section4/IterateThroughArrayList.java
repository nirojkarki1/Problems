package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> counts = new ArrayList<>();

        for (String s: myList){
            int count = s.length();
            counts.add(count);
        }


        return new ArrayList<>(counts);
    }
}
