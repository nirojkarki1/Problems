package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CreateAFile implements Assignment {
    Path filePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\java\\pyramid\\assignments\\section8\\sample_data.txt");

    public void createAFile() {
        System.out.println(filePath);
        try {
            Files.createFile(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToAFile() {
        try{
            Files.writeString(filePath, "test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Character> readAFile() {
        ArrayList<Character> myCarList = new ArrayList<>();
        String temp;

        try {
            //set temp to file dot read string and give it the file path.
            temp = Files.readString(filePath);
            //Iterate through the temp and add the temp.char at i to the myCarList.
            for(int i = 0; i <= temp.length() -1; i++) {
                myCarList.add(temp.charAt(i));
            }
            //return myCarList
            return myCarList;
        } catch (Exception e) {
            //Print stack trace
            e.printStackTrace();
        }
        //return myCarList
        return myCarList;
    }
}
