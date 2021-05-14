package pjatk;

import javax.print.attribute.standard.Severity;

public class PoliceAlarm implements Alarm {
    public void alarmTurnOn(PinEvent e) {
        Severity severity = Severity.WARNING;
        EventSource eventSource = new EventSource("Police alarm");
        String string = "Alarm turned on";

        Alarm.logger.LogMessage(severity, eventSource, string);
    }

    public void alarmTurnOff(PinEvent e) {
        Severity severity = Severity.WARNING;
        EventSource eventSource = new EventSource("Police alarm");
        String string = "Alarm turned off";

        Alarm.logger.LogMessage(severity, eventSource, string);
    }
}
