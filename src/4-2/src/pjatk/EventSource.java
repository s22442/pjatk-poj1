package pjatk;

public class EventSource {
    private String sourceName;

    public EventSource(String sourceName) {
        this.sourceName = sourceName;
    }

    public String toString() {
        return String.format("EventSource{sourceName=\"%s\"}", this.sourceName);
    }
}
