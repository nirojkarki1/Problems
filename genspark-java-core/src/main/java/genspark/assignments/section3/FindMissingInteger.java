package genspark.assignments.section3;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int test = 0;
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) != i+1) {
                test = i + 1;
                break;
            }
        }
        return test;
    }
}
