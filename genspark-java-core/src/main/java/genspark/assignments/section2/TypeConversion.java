package genspark.assignments.section2;

import genspark.assignments.Assignment;
public class TypeConversion implements Assignment {
    public Object solution(Object object) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(object instanceof Integer) {
            return object.toString();
        } else if(object instanceof String) {
            return Integer.parseInt(object.toString());
        } else {
            return object.toString();
        }
    }
}
