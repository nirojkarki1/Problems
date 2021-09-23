package genspark.assignments.section8;

import genspark.assignments.Assignment;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public class RecordOfTextsAndCalls implements Assignment {

    static List<Call> getCalls() throws IOException {
        return Files.readLines(new File(System.getProperty("user.dir") + "/src/main/resources/calls.csv"), Charset.defaultCharset())
                .stream()
                .map(e -> {
                    var data = e.split(",");
                    return new Call(data[0], data[1], data[2], data[3]);})
                .collect(Collectors.toList());
    }
    static List<Text> getTexts() throws IOException {
        return Files.readLines(new File(System.getProperty("user.dir") + "/src/main/resources/texts.csv"), Charset.defaultCharset())
                .stream()
                .map(e -> {
                    var data = e.split(",");
                    return new Text(data[0], data[1], data[2]);})
                .collect(Collectors.toList());
    }

    public String solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return null;
    }
}
