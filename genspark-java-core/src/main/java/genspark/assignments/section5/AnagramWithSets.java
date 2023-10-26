package genspark.assignments.section5;

import genspark.assignments.Assignment;
import it.unimi.dsi.fastutil.Hash;

import java.util.HashSet;

public class AnagramWithSets implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        boolean containsDL1= true;
        boolean containsDL2= true;
     if ( word1.length()== word2.length()) {

         for (int i = 0; i < word1.length(); i++) {
             char c1 = word1.charAt(i);
             if (!((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z') || (c1 >= '0' && c1 <= '9'))) ;
             {
                 containsDL1 = false;
             }

             char c2 = word2.charAt(i);
             if (!((c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || (c2 >= '0' && c2 <= '9'))) ;
             {
                 containsDL2 = false;
             }

         }
         if (containsDL1 == true && containsDL2==true) {

             char[] arr1 = word1.toCharArray();
             char[] arr2 = word2.toCharArray();

             HashSet<Character> set1 = new HashSet<>();
             HashSet<Character> set2 = new HashSet<>();
             for (char c : arr1) {
                 set1.add(c);
             }
             for (char c : arr2) {
                 set2.add(c);
             }
             set1.removeAll(set2);
             set2.removeAll(set1);

             if (set1.size() == set2.size() && set1.containsAll(set2)) {
                 return true;
             } else {
                 return false;
             }
         }
         else{
             return false;
         }

     }
     else{
         return false;}

    }


}
