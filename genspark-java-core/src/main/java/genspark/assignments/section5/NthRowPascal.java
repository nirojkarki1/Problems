package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         int[] pascal = new int[nth +1];
         pascal[0] =1;
         for(int i =1; i<= nth; i++){
             for(int j = i; j>= 1; j--){
                 pascal[j] += pascal[j-1];
             }
         }
         ArrayList<Integer> al = new ArrayList<Integer>();
     for (int pas: pascal){
         al.add(pas);
     }

        return al;
    }
}
