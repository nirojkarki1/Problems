package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int sum=0;
       for (int i =0; i< numbers.length;i++){
           sum = Arrays.stream(numbers).sum();
       }
        return sum;
    }
}
