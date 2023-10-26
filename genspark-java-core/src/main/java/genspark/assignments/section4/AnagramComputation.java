package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnagramComputation implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
         Pattern p = Pattern.compile("[^A-Za-z0-9]");
         Matcher m = p.matcher(word1);
         Matcher m1 = p.matcher(word2);
         if(m.matches()== true ) {
             char charword1[] = word1.toCharArray();
             char charword2[] = word2.toCharArray();

             int n1 = charword1.length;
             int n2 = charword2.length;
             if (n1 == n2) {

                 Arrays.sort(charword1);
                 Arrays.sort(charword2);

                 boolean result = Arrays.equals(charword1, charword2);
                 return result;
             } else {
                 return false;
             }
         }
         else{
             return false;
         }
    }
}
