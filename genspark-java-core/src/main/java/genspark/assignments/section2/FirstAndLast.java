package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int n = word.length();
        String firstL = (word.substring(0,1).toUpperCase());
        String LastL = (word.substring((n-1),n)).toUpperCase();

        if (firstL.equals(LastL)){
            return true;
        }
        else {
            return false;
        }

    }
}
