package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumAnArray implements Assignment {
    public int solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int result = Arrays.stream(nums).reduce(0,(firstElement,secElement) -> firstElement+secElement);
        return result;
    }
}
