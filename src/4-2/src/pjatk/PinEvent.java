package pjatk;

import java.util.Date;

public class PinEvent {
    private Safe safe;
    public Date eventDate;

    public PinEvent(Safe safe, Date eventDate) {
        this.safe = safe;
        this.eventDate = eventDate;
    }

    public Safe getSafe() {
        return this.safe;
    }
}
