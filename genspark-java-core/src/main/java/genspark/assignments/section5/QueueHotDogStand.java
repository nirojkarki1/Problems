package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(list.size() == 0) {
            return list;
        }
        Queue<Integer> queue = new LinkedList<>(list);
        for(int i = 0; i < 3; i++) {
            Integer personId = queue.poll();
            queue.add(personId);
        }
        ArrayList<Integer> solution = new ArrayList<>(queue);
        return solution;
    }
}
