package pjatk;

import javax.print.attribute.standard.Severity;

public interface Logger {
    Severity logLevel = Severity.WARNING;

    void LogMessage(Severity severity, EventSource eventSource, String string);
}
