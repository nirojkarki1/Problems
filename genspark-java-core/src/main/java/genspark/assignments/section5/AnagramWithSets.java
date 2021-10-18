package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class AnagramWithSets implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(word1.equals(word2)){
            return false;
        }
        return
                Arrays.equals(
                        Arrays.stream(word1.split("")).sorted().toArray(),
                        Arrays.stream(word2.split("")).sorted().toArray()
                );
    }
}
