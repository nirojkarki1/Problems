package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class QueryTheFile implements Assignment {
    public ArrayList<String> solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Path filePath = Paths.get(System.getProperty("user.dir") + "\\resources\\filter_problem.text");
        String temp;

        try {
            temp = Files.readString(filePath);
            ArrayList<String> myList = new ArrayList<>(Arrays.asList(temp.split("\n")));
            return myList.stream().filter((s) -> !s.contains("2")).collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
