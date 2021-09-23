package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> solution = new ArrayList<>();
        String firstItr = "";
        for(var e: list) {
            firstItr += e;
        }

        int x = Integer.parseInt(firstItr);
        x++;

        String[] secondItr = String.valueOf(x).split("");

        for(int i = 0; i <= secondItr.length-1; i++) {
            solution.add(Integer.valueOf(secondItr[i]));
        }
        return solution;
    }
}
