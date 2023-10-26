package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
      int reverse=0;
      while(number!=0) {
          int remainder = number % 10;
          reverse = reverse * 10 + remainder;
          number = number / 10;

      }
        return reverse;
    }
}
