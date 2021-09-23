package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class TotalNumberOfCalls implements Assignment {
    public int solution() throws IOException {
        var calls = RecordOfTextsAndCalls.getCalls();
        var texts = RecordOfTextsAndCalls.getTexts();
        return
                (int) Stream.concat(
                                calls.stream().map(call -> List.of(call.getCalling(), call.getReceiving()).stream()),
                                texts.stream().map(call -> List.of(call.getSending(), call.getReceiving()).stream())
                        ).flatMap(e -> e)
                        .distinct()
                        .count();
    }
}

