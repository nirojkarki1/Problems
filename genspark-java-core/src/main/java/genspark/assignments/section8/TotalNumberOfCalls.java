package genspark.assignments.section8;


import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class TotalNumberOfCalls implements Assignment {
    public int solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        BufferedReader reader;

        try {

            FileReader calls = new FileReader(System.getProperty("user.dir") + "/src/pyramid_course_assignments/section8/calls.csv");
            FileReader texts = new FileReader(System.getProperty("user.dir") + "/src/pyramid_course_assignments/section8/texts.csv");

            Set<String> numbers = new HashSet<>();

            reader = new BufferedReader(calls);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] call = line.split(",");
                numbers.add(call[0]);
                numbers.add(call[1]);
            }
            reader.close();

            reader = new BufferedReader(texts);
            while ((line = reader.readLine()) != null) {
                String[] text = line.split(",");
                numbers.add(text[0]);
                numbers.add(text[1]);
            }
            reader.close();
            return numbers.size();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
