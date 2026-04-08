public class Card {

    private Wartosc wartosc;
    private Kolor kolor;

    public Card(Wartosc wartosc, Kolor kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return wartosc + " " + kolor;
    }



}
