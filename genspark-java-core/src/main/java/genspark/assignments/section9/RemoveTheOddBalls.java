package genspark.assignments.section9;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class RemoveTheOddBalls implements Assignment {
    public Object[] solution(ArrayList<String> words) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return words.stream().filter((x -> x.length() % 2 == 0)).toArray();
    }
}
