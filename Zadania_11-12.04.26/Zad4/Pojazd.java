public class Pojazd extends Maszyna {

    protected double moc;
    protected double momentObrotowy;

    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika,
                  RodzajSilnika rodzajSilnika,
                  double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Moc: " + moc);
        System.out.println("Moment obrotowy: " + momentObrotowy);
    }
}
