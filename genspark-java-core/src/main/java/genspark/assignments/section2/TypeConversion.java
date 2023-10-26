package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TypeConversion implements Assignment {
    public Object solution(Object object) {
     //    ↓↓↓↓ your code goes here ↓↓↓↓
         if ( object instanceof Integer){
             String s = String.valueOf(object);
             return s;
         }
         else if( object instanceof String){
             int num = Integer.parseInt(String.valueOf(object));
             return num;
         }
         else if(object instanceof Character){
             String c = String.valueOf(object);
             return c;

         }
        return null;
    }
}
