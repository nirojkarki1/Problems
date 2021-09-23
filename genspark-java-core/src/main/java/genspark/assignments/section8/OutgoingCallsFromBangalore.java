package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OutgoingCallsFromBangalore implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Pattern fixedLinesPattern = Pattern.compile("\\((0[0-9]+)\\)[0-9]+"),
                mobileNumbersPattern = Pattern.compile("([789][0-9]{3})[0-9]* [0-9]+"),
                telemarketersPattern = Pattern.compile("(140)[0-9]*");
        var calls = RecordOfTextsAndCalls.getCalls();

        var numbers = new HashSet<String>();

        for (var call : calls) {
            var calling = call.getCalling();
            var mn = mobileNumbersPattern.matcher(calling);
            var tm = telemarketersPattern.matcher(calling);
            var fl = fixedLinesPattern.matcher(calling);
            if (mn.find()){
                numbers.add(mn.group(1));
            } else if (tm.find()){
                numbers.add(tm.group(1));
            } else if (fl.find()){
                numbers.add(fl.group(1));
            }
        }
        return numbers.stream()
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
