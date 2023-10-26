package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> missing = new ArrayList<Integer>();
        int size = nums.size();
        int expected = 1;
        for (int i = 0; i< nums.size();i++){
            int num = nums.get(i);
            while(num != expected){
                missing.add(expected);
                expected++;
            }
            expected++;
        }


        return missing;
    }
}
