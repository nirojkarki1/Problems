package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        if(nth == 0) {
            return currentRow;
        }

        ArrayList<Integer> previousRow = solution(nth -1);

        for(int i = 1; i < previousRow.size(); i++) {
            int curr = previousRow.get(i -1) + previousRow.get(i);
            currentRow.add(curr);
        }
        currentRow.add(1);

        return currentRow;
    }
}
