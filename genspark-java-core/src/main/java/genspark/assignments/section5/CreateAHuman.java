package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;

public class CreateAHuman implements Assignment {
    public HashMap<String, Object> solution(String name, Long age) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         HashMap<String,Object> map = new HashMap<>();
         map.put("name",name);
         map.put("age", age);
        return map;
    }
}
