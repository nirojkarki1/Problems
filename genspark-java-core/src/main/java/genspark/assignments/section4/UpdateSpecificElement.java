package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class UpdateSpecificElement implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         try {list.set(index,val);}
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e.getMessage());
         }
       return list;
    }
}
