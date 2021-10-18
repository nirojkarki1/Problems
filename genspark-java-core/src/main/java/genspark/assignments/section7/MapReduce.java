package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MapReduce implements Assignment {
    public int[] solution(ArrayList<ArrayList<Integer>> innerNums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return innerNums.stream().map(i ->
                        i.stream().reduce(Integer::sum).get()
                )
                .mapToInt(Integer::intValue).toArray();
    }
}
