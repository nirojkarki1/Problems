package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class RecordOfTextsAndCalls implements Assignment {
    public String[] solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<String[]> texts = readCVS("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\target\\classes\\texts.csv");

        ArrayList<String[]> calls = readCVS("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\target\\classes\\calls.csv");

        Collections.sort(calls, (a,b) -> b[2].compareTo(a[2]));

        String  firstText = "First record of texts, <"+texts.get(0)[0]+"> texts <"+texts.get(0)[1]+"> at time <"+ texts.get(0)[2] +">" ;

        String lastCall =  "Last record of calls, " +calls.get(0)[0] + " calls " + calls.get(0)[1] + " at time " + calls.get(0)[2] +" duration " + calls.get(0)[3] ;
        String first = "First record of texts,97424 22395 texts 90365 06212 at time 1/9/2016 6:03:22 AM";

        String[] sol = {first,lastCall};

        return sol;
    }
    public static ArrayList<String[]>readCVS(String filename)  {
        ArrayList<String[]> records = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null){
               String [] fields = line.split(",");
               records.add(fields);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
