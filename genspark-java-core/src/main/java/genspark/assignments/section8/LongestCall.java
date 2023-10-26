package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LongestCall implements Assignment {
    public String solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String callsfilePath = "C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\target\\classes\\calls.csv";
        Map<String, Integer> phoneDurations = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(callsfilePath))){
         String line = br.readLine();
         while((line = br.readLine())!= null){
             String[] tokens = line.split(",");
             String callingNumber = tokens[0];
             String receivingNumber = tokens[1];
             String durationStr = tokens[3];
             int duration = Integer.parseInt(durationStr);

             phoneDurations.put(callingNumber,phoneDurations.getOrDefault(callingNumber,0)+ duration);
             phoneDurations.put(receivingNumber,phoneDurations.getOrDefault(receivingNumber,0)+duration);

         }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String longestDurationNumber = "";
        int longestDuration =0;
        for(Map.Entry<String,Integer> entry : phoneDurations.entrySet()){
            if(entry.getValue()>longestDuration){
                longestDuration = entry.getValue();
                longestDurationNumber = entry.getKey();

            }
        }

        return longestDurationNumber;
    }
}
