package genspark.assignments.section9;
import genspark.assignments.Assignment;

import java.util.Arrays;

public class SumAnArray implements Assignment {
    public int solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(nums.length == 0) {
            return 0;
        }
        return Arrays.stream(nums).reduce((acc, next) -> acc + next).getAsInt();
    }
}
