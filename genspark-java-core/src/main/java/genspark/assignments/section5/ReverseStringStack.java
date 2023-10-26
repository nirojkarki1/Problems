package genspark.assignments.section5;

import genspark.assignments.Assignment;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String reverse ="";
        for (int i =word.length()-1;i>=0;i--){

            reverse = reverse + word.charAt(i);
        }
        return reverse;

    }
}
