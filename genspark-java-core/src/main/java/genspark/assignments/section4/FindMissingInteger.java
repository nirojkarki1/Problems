package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int maxNumber = numbers.get(0);
        for (int i =1; i<numbers.size(); i++){
            if(maxNumber< numbers.get(i))
                maxNumber=numbers.get(i);
        }
        int sumOfAllNumbers =0;
        int currentSum =0;
        int zero =0;
        sumOfAllNumbers= (maxNumber * (maxNumber+ 1 ))/2;
         for(int i =0; i<numbers.size();i++){
             currentSum += numbers.get(i);
         }
         if(sumOfAllNumbers == currentSum) {

             return 0;
         }
         else{
             int missingNum = (sumOfAllNumbers - currentSum);
             return currentSum;
         }

    }

}
