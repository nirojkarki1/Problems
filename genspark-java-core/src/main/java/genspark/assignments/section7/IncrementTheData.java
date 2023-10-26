package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class IncrementTheData implements Assignment {
    public Object solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
       ArrayList result = IntStream.range(0, nums.size()).map(i -> nums.get(i) +10).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        return result;
    }
}
