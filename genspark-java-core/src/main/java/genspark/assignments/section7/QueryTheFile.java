package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QueryTheFile implements Assignment {
    public ArrayList<String> solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<String>  lines = null;
        try {
            lines = Files.readAllLines(Paths.get("resource/filter_problem.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
