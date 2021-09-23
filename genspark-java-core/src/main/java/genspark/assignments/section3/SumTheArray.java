package genspark.assignments.section3;

import genspark.assignments.Assignment;
public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int sum = 0;
        for(int i = 0; i <= numbers.length-1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
