package pjatk;

public class Samochod extends Pojazd {
    private enum Segment {
    };

    private enum Vin {
    };

    private Segment segment;
    private Vin VIN;

    public Samochod(String marka, String nazwa, int pojemnoscSilnika, Silnik rodzajSilnika, double moc,
            double momentObrotowy, Segment segment, Vin VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public void setVIN(Vin VIN) {
        this.VIN = VIN;
    }

    public Segment getSegment() {
        return this.segment;
    }

    public Vin getVIN() {
        return this.VIN;
    }

    @Override
    public String toString() {
        return String.format("Samochod{%s, segment=%s, VIN=%s}", super.toString(), this.segment, this.VIN);
    }

    // Ta metoda istnieje już w klasie Pojazd
    // @Override
    // public void wyswietl() {
    //     System.out.println(this);
    // }
}
