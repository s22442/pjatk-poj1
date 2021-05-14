package pjatk;

import java.io.FileWriter;
import java.io.IOException;

import javax.print.attribute.standard.Severity;

public class FileLogger implements Logger {
    public void LogMessage(Severity severity, EventSource eventSource, String string) {
        String content = "";
        content += String.format("Severity: %s%n", severity);
        content += String.format("Event source: %s%n", eventSource);
        content += String.format("String: %s%n", string);

        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Logging message to log.txt has failed!");
        }
    }
}
