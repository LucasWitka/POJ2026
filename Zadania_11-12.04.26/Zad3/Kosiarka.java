public class Kosiarka extends Maszyna {

    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika,
                    RodzajSilnika rodzajSilnika,
                    boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
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

    @Override
    public void wyswietl() {
        System.out.println("Kosiarka:");
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Melekser: " + (czyMelekser ? "tak" : "nie"));
        System.out.println("Napęd: " + (czyNaped ? "tak" : "nie"));
        System.out.println("Liczba ostrzy: " + liczbaOstrzy);
    }
}
