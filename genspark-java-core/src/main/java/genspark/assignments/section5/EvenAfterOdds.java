package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
          int left =0;
          int right = nums.size()-1;
          while(left<right){
              if(nums.get(left)%2 == 0 && nums.get(right)% 2 == 1){
                  int temp =nums.get(left);
                  nums.set(left,nums.get(right));
                  nums.set(right,temp);
                  left++;
                  right--;
              }
              else{
                  if(nums.get(left)% 2 == 1){
                      left++;
                  }
                  if(nums.get(right)% 2== 0){
                      right--;
                  }
              }
          }
        return nums;
    }
}
