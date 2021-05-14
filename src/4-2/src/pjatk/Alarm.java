package pjatk;

public interface Alarm {
    Logger logger = new ConsoleLogger();

    void alarmTurnOn(PinEvent e);

    void alarmTurnOff(PinEvent e);
}
