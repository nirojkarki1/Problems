package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int factorial=1;
        for(int i =1; i<=n; i++)
            factorial *= i;
        return factorial;
    }
}
