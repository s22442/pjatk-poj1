package pjatk;

import java.util.ArrayList;
import java.util.Date;

public class Safe {
    public ArrayList<Alarm> alarms;
    private String pin;

    public Safe(ArrayList<Alarm> alarms, String pin) {
        this.alarms = alarms;
        this.pin = pin;
    }

    public void addAlarm(Alarm alarm) {
        this.alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        this.alarms.remove(alarm);
    }

    public void enterPin(String pin) {
        if (pin == this.pin) {
            this.correctPin();
        } else {
            this.wrongPin();
        }
    }

    private void correctPin() {
        for (Alarm alarm : this.alarms) {
            alarm.alarmTurnOff(new PinEvent(this, new Date()));
        }
    }

    private void wrongPin() {
        for (Alarm alarm : this.alarms) {
            alarm.alarmTurnOn(new PinEvent(this, new Date()));
        }
    }
}
