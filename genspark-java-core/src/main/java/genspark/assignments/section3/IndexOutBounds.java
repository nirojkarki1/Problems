package genspark.assignments.section3;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class IndexOutBounds implements Assignment {
    public Object solution(int[] array, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int element;

        try{
              element =array[index];

//
          }
        catch(ArrayIndexOutOfBoundsException e){
            return ( "Caught Exception: Index Out of Bounds.");
        }
        return element;
    }
}
