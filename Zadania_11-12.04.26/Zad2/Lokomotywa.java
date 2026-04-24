public class Lokomotywa extends Maszyna {

    private int moc;
    private int liczbaWagonow;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika,
                      RodzajSilnika rodzajSilnika, int moc, int liczbaWagonow) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.liczbaWagonow = liczbaWagonow;
    }

    @Override
    public void wyswietl() {
        System.out.println("Lokomotywa:");
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " L");
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Moc: " + moc + " KM");
        System.out.println("Liczba wagonów: " + liczbaWagonow);
    }
}