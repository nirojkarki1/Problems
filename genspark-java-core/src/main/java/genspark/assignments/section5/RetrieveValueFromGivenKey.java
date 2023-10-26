package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;

public class RetrieveValueFromGivenKey implements Assignment {
    public int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int result =0;
        try{
            result = map.get(value);
            if (result == 0) {
                return 0;
            } else {
                return result;
            }


        }catch(NullPointerException e){
            return 0;
        }


    }
}
