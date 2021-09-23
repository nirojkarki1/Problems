package genspark.assignments.section2;

import genspark.assignments.Assignment;
public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String rev = "";
        int x = str.length();
        if(str.equals("")){
            return "";
        }
        do {
            --x;
            rev += str.charAt(x);
        } while(x >= 1);

        return rev;
    }
}
