package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }

        //List<Integer> temp1 = new ArrayList<>();


        int[] temp = new int[mySet.size()];
        Iterator<Integer> itr = mySet.iterator();
        for(int i = 0; i < temp.length; i++) {
            temp[i] = (int) itr.next();
        }
        return temp;
    }
}
