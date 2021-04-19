package pjatk;

public class Pojazd extends Maszyna {
    protected static int maxLiczbaPojazdow = 0;
    protected int nrPojazdu;
    protected double moc;
    protected double momentObrotowy;

    public Pojazd() {
        Pojazd.maxLiczbaPojazdow++;
        this.nrPojazdu = Pojazd.maxLiczbaPojazdow;
    }

    public Pojazd(String marka, String nazwa, int pojemnoscSilnika, Silnik rodzajSilnika, double moc,
            double momentObrotowy) {
        Pojazd.maxLiczbaPojazdow++;
        this.nrPojazdu = Pojazd.maxLiczbaPojazdow;

        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public void setMomentObrotowy(double momentObrotowy) {
        this.momentObrotowy = momentObrotowy;
    }

    public int getNrPojazdu() {
        return this.nrPojazdu;
    }

    public double getMoc() {
        return this.moc;
    }

    public double getMomentObrotowy() {
        return this.momentObrotowy;
    }

    public String toString() {
        return String.format(
                "Pojazd %d z %d{marka=%s, nazwa=%s, pojemnoscSilnika=%d, rodzajSilnika=%s, moc=%.2f, momentObrotowy=%.2f}",
                this.nrPojazdu, Pojazd.maxLiczbaPojazdow, this.marka, this.nazwa, this.pojemnoscSilnika,
                this.rodzajSilnika, this.moc, this.momentObrotowy);
    }

    public void wyswietl() {
        System.out.println(this);
    }
}
