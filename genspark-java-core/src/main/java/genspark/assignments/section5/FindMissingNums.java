package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> set1 = new HashSet<>(nums);
        Set<Integer> set2 = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toSet());
        set2.removeAll(set1);
        return new ArrayList<>(set2);
    }
}
