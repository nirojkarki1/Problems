package genspark.assignments.section2;
import genspark.assignments.Assignment;
public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return new StringBuilder(String.valueOf(number)).reverse().toString();
    }
}