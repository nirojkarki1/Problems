package genspark.assignments.section8;

import com.google.common.io.Files;
import genspark.assignments.Assignment;

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
    public String[] solution() throws IOException {
        var calls = getCalls();
        var texts = getTexts();
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return new String[]{
                String.format("First record of texts, %s texts %s at time %s", texts.get(0).getSending(), texts.get(0).getReceiving(), texts.get(0).getTime())
                ,
                String.format(
                        "Last record of calls, %s calls %s at time %s, lasting %s seconds",
                        calls.get(calls.size() - 1).getCalling(),
                        calls.get(calls.size() - 1).getReceiving(),
                        calls.get(calls.size() - 1).getStart(),
                        calls.get(calls.size() - 1).getDuration()
                )};
    }
}
