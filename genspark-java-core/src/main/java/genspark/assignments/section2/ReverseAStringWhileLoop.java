package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        StringBuilder sb = new StringBuilder();
        String reverse="";
        int length = str.length();
        int i = length -1;
        while(i>=0){
          sb.append(str.charAt(i));
          i--;
        }
        reverse = sb.toString();
        return reverse;
    }
}
