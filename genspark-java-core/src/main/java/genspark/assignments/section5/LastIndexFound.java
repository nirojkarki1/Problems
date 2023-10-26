package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class LastIndexFound implements Assignment {
    public int solution(ArrayList<Integer> nums, int numToFind) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int lastIndex =-1;
         for( int i = 0; i < nums.size();i++){
             if(nums.get(i)== numToFind){
                 lastIndex =i;
             }
         }
        return lastIndex;
    }
}
