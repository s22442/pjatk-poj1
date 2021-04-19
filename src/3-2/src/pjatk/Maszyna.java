package pjatk;

public abstract class Maszyna {
    protected enum Silnik {
        Benzynowy, Diesel, Elektryczny
    };

    protected String marka;
    protected String nazwa;
    protected int pojemnoscSilnika;
    protected Silnik rodzajSilnika;

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setRodzajSilnika(Silnik rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public int getPojemnoscSilnika() {
        return this.pojemnoscSilnika;
    }

    public Silnik getRodzajSilnika() {
        return this.rodzajSilnika;
    }
}
