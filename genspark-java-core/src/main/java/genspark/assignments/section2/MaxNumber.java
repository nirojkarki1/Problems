package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MaxNumber implements Assignment {
    public int solution(int a, int b) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(a<=b){
            return b;
        }else
        return a;
    }
}
