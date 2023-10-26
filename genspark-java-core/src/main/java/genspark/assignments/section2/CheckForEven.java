package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForEven implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
       if(number%2==0){
           String s= "even";
          return s;
       }else{
           String s= "odd";
           return s;
       }

    }
}
