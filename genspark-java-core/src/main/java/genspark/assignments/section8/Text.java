package genspark.assignments.section8;

public class Text {
    private final String sending, receiving;
    private final String time;

    public Text(String sending, String receiving, String time) {
        this.sending = sending;
        this.receiving = receiving;
        this.time = time;
    }

    public String getSending() {
        return sending;
    }

    public String getReceiving() {
        return receiving;
    }

    public String getTime() {
        return time;
    }
}
