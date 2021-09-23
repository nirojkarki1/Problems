package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PotentialTelemarketers implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        var calls = RecordOfTextsAndCalls.getCalls();
        var texts = RecordOfTextsAndCalls.getTexts();

//        var numbersThatSendOrReceiveTexts =
//                texts.stream()
//                        .map(t -> Stream.of(t.getSending(), t.getReceiving()))
//                        .flatMap(i -> i.collect(Collectors.toList()))
//                        .collect(Collectors.toSet());
        var numbersThatReceiveCalls =
                calls.stream()
                        .map(Call::getReceiving)
                        .collect(Collectors.toSet());
        var allCalls =
                calls.stream()
                        .map(c -> List.of(c.getCalling(), c.getReceiving()))
                        .flatMap(Collection::stream);
                        //.collect(Collectors.toSet());
        return
                allCalls
                        .filter(c -> !numbersThatReceiveCalls.contains(c))
                        .sorted()
                        .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new PotentialTelemarketers().solution());
    }
}
