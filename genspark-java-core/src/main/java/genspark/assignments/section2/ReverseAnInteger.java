package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String num = Integer.toString(number);
        String reverseStr ="";
        for(int i= num.length()-1;i>=0;i--){
           reverseStr = reverseStr + num.charAt(i);
        }
        return reverseStr;
    }
}
