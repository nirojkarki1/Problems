package genspark.assignments.section4;

import clojure.lang.LazySeq;
import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> list = new ArrayList<>();
         if (elms.size()== 0 )
             return list;
         else if (from ==0 && to ==0){
             return list;
         }
         else{

               ArrayList<Integer> sublist = new ArrayList<>(elms.subList(from,to));

           return sublist;
         }

    }
}
