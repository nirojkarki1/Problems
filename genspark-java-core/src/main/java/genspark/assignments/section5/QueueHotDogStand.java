package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.offer(list);

        // rotate the queue 3 times
         for(int i = 0; i<2 ; i++){
             queue.offer(queue.poll());
         }

         ArrayList<Integer> thirdrotation = queue.peek();


        return thirdrotation;
    }
}
