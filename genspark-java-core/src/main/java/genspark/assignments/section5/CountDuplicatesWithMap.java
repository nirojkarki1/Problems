package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

         HashMap<Integer,Integer> countMap = new HashMap<>();
         for (int i =0; i< nums.size();i++){
             int element = nums.get(i);
             if(countMap.containsKey(element)){
                 int count = countMap.get(element);
                 countMap.put(element,count +1);
             }else{
                 countMap.put(element,1);
             }
         }


        return countMap;
    }
}
