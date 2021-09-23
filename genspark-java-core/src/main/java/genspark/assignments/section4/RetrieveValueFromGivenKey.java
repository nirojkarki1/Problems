package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.HashMap;

public class RetrieveValueFromGivenKey implements Assignment {
    public int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Object myObject = new String("String");
        if(map.containsKey(value)){
            return map.get(value);
        }
        return 0;
    }
}
