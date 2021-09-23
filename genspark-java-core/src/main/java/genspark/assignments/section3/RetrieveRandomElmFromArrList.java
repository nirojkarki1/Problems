package genspark.assignments.section3;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class RetrieveRandomElmFromArrList implements Assignment {
    public Integer solution(ArrayList<Integer> arrList, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (arrList.size() <= elm){
            return 0;
        }
        return arrList.get(elm);
    }
}
