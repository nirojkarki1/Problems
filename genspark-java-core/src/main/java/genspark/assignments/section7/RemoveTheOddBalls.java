package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveTheOddBalls implements Assignment {
    public Object[] solution(ArrayList<String> words) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


       Object[] filteredArray = words.stream().filter(word -> word.length()%2 ==0).map(word -> word.replaceAll("\\W","")).toArray();


        return filteredArray;
    }
}
