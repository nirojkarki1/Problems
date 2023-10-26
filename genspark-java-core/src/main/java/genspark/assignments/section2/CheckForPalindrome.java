package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        StringBuffer stringBuffer = new StringBuffer(pally);
        return stringBuffer.reverse().toString().equals(pally);
    }
}
