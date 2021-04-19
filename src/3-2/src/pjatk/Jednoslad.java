package pjatk;

public class Jednoslad extends Pojazd {
    private enum Typ {
    };

    private Typ typ;

    public Jednoslad() {
        super();
    }

    public Jednoslad(String marka, String nazwa, int pojemnoscSilnika, Silnik rodzajSilnika, double moc,
            double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
    }

    public Jednoslad(String marka, String nazwa, int pojemnoscSilnika, Silnik rodzajSilnika, double moc,
            double momentObrotowy, Typ typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public Typ getTyp() {
        return this.typ;
    }

    @Override
    public String toString() {
        String str = String.format("Jednoslad{Pojazd %d z %d{", this.nrPojazdu, Pojazd.maxLiczbaPojazdow);

        if (this.marka != null) {
            str += String.format("marka=%s ", this.marka);
        }
        if (this.nazwa != null) {
            str += String.format("nazwa=%s ", this.nazwa);
        }
        if (this.pojemnoscSilnika != 0) {
            str += String.format("marka=%d ", this.pojemnoscSilnika);
        }
        if (this.rodzajSilnika != null) {
            str += String.format("rodzajSilnika=%s", this.rodzajSilnika);
        }
        str += "}";

        if (this.typ != null) {
            str += String.format("typ=%s", this.typ);
        }
        str += "}";

        return str;
    }

    // Ta metoda istnieje już w klasie Pojazd
    // @Override
    // public void wyswietl() {
    //     System.out.println(this);
    // }
}
