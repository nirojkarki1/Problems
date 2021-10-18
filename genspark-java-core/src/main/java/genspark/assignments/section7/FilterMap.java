package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterMap implements Assignment {
    public Object[] solution(ArrayList<ArrayList<Integer>> listolists) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
       return listolists.stream()
                .filter(i -> i.size() % 2 != 0)
                .map(i -> i.stream().map(n -> n * 10)
                        .collect(Collectors.toList())
                ).toArray();
    }
}
