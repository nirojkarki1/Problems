package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> revList = new ArrayList<Integer>();
        for (int i = list.size() -1; i>=0; i--){
            revList.add(list.get(i));
        }


        return revList;
    }
}
