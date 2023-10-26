package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
         int [] number = list.stream().mapToInt(Integer::intValue).toArray();
         int result =0;
         int offset =1;
         for(int i = number.length -1;i>=0;i--){
             result += number[i]* offset;
             offset *= 10;
         }
         int newNum = result + 1;
         ArrayList<Integer> List1 = new ArrayList<>();
          String numStr = Integer.toString(newNum);
          for(int i =0; i< numStr.length(); i++){
              int digit = Integer.parseInt((String.valueOf(numStr.charAt(i))));
              List1.add(digit);
          }


        return  List1;
    }
}
