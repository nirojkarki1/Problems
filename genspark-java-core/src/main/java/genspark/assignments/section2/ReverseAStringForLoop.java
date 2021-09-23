package genspark.assignments.section2;

import genspark.assignments.Assignment;
public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String tmp = "";
        for (int i = str.length() -1; i >= 0; i--) {
            tmp += str.charAt(i);
        }
        return tmp;
    }
}
