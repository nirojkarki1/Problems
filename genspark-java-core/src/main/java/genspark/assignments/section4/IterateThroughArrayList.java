package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return myList.stream()
                .map(String::length)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
