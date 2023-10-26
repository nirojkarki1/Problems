package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class TotalNumberOfCalls implements Assignment {
    public int solution() throws IOException {

        HashSet<String> phoneNumber = new HashSet<>();

         try(BufferedReader brtext = new BufferedReader(new FileReader("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\target\\classes\\texts.csv"))){
         String line;
         while((line = brtext.readLine()) != null){
             String [] values = line.split(",");
             String sendingNumber = values[0].trim();
             String reveivingNumber = values[1].trim();
             phoneNumber.add(sendingNumber);
             phoneNumber.add(reveivingNumber);
         }
         }
         catch (IOException e){
             e.printStackTrace();
         }
        try(BufferedReader brcall = new BufferedReader(new FileReader("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\target\\classes\\calls.csv"))){
            String line;
            while((line = brcall.readLine()) != null){
                String [] values = line.split(",");
                String sendingNumber = values[0].trim();
                String reveivingNumber = values[1].trim();
                phoneNumber.add(sendingNumber);
                phoneNumber.add(reveivingNumber);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


        return phoneNumber.size();
    }
}

