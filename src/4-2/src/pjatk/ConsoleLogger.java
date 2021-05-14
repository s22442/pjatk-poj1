package pjatk;

import javax.print.attribute.standard.Severity;

public class ConsoleLogger implements Logger {
    public void LogMessage(Severity severity, EventSource eventSource, String string) {
        System.out.printf("Severity: %s%n", severity);
        System.out.printf("Event source: %s%n", eventSource);
        System.out.printf("String: %s%n", string);
    }
}
