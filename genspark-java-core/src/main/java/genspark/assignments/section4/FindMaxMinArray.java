package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Long> list = new ArrayList<>();
        if (nums.length ==0 ){
           list.add(0,0l);
           list.add(1,0l);

        }else
         {
             int min = nums[0];
             int max = nums[0];
             for (int i=1;i<nums.length;i++){
                 if(nums[i]< min){
                     min =nums[i];
                 }else if(nums[i]> max){
                     max = nums[i];

                 }
             }
             long maxlong = new Long(max);
             long minLong = new Long(min);
             list.add(0,maxlong);
             list.add(1,minLong);
             return list;
        }
        return list;
    }
}
