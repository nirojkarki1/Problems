package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCall implements Assignment {
    public String solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        BufferedReader reader;
        List<String[]> callsList = new ArrayList<>();

        try {
            FileReader calls = new FileReader(System.getProperty("user.dir") + "/src/main/resources/calls.csv");

            reader = new BufferedReader(calls);
            String line;
            while ((line = reader.readLine()) != null) {
                callsList.add(line.split(","));
            }
            reader.close();

            Map<String, Integer> callLengths = new HashMap<>();


            for (String[] call : callsList) {
                String num1 = call[0];
                String num2 = call[1];
                int length = Integer.parseInt(call[3]);

                callLengths.put(num1, callLengths.containsKey(num1) ? callLengths.get(num1) + length : length);
                callLengths.put(num2, callLengths.containsKey(num2) ? callLengths.get(num2) + length : length);
            }

            int max = 0;
            String longest = "";

            for (String number : callLengths.keySet()) {
                if (callLengths.get(number) > max) {
                    max = callLengths.get(number);
                    longest = number;
                }
            }
            return longest;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
