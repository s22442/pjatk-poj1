package pjatk;

public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, int pojemnoscSilnika, Silnik rodzajSilnika, boolean czyMelekser,
            boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public boolean getCzyMelekser() {
        return this.czyMelekser;
    }

    public boolean getCzyNaped() {
        return this.czyNaped;
    }

    public int getLiczbaOstrzy() {
        return this.liczbaOstrzy;
    }

    public String toString() {
        return String.format(
                "Kosiarka{marka=%s, nazwa=%s, pojemnoscSilnika=%d, rodzajSilnika=%s, czyMelekser=%b, czyNaped=%b, liczbaOstrzy=%d}",
                this.marka, this.nazwa, this.pojemnoscSilnika, this.rodzajSilnika, this.czyMelekser, this.czyNaped,
                this.liczbaOstrzy);
    }

    public void wyswietl() {
        System.out.println(this);
    }
}
