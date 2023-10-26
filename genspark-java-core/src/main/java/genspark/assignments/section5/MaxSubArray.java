package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MaxSubArray implements Assignment {

    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         int maxSum = Integer.MIN_VALUE;
         int currentSum =0;
         int start =0;
         int end = 0;
         int currentStart =0;

         for(int i =0; i<nums.size();i++) {
             int num = nums.get(i);
             currentSum += num;

             if (currentSum > maxSum) {
                 maxSum = currentSum;
                 start = currentStart;
                 end = i;
             }
             if (currentSum<0){
                 currentSum =0;
                 currentStart = i +1;
             }

         }
         ArrayList<Integer> result = new ArrayList<>();
         for(int i = start; i <= end ; i++){
             result.add(nums.get(i));
         }
        return result;
    }
}
