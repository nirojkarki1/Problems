package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String result ="";
      float mean = (a + b + c)/3f;
      String meanS = "" +mean;
      int arr[] = {a,b,c};
        Arrays.sort(arr);
        int medianV = arr[1];
        String medianVStr = " "+Integer.toString(medianV);
        result =meanS +medianVStr;
        return result;
    }
}
