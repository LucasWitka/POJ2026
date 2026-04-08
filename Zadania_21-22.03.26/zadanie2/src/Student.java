public class Student {

    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private double obecnosc; // w procentach
    private int ocena;

    public Student(String imie, String nazwisko, int numerIndeksu, double obecnosc, int ocena) {
        this.imie = (imie == null || imie.isEmpty()) ? "Unknown" : imie;
        this.nazwisko = (nazwisko == null || nazwisko.isEmpty()) ? "Unknown" : nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.obecnosc = obecnosc;

        if (obecnosc < 50) {
            this.ocena = 2;
        } else {
            this.ocena = ocena;
        }
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public int getOcena() {
        return ocena;
    }


    public void setImie(String imie) {
        this.imie = (imie == null || imie.isEmpty()) ? "Unknown" : imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = (nazwisko == null || nazwisko.isEmpty()) ? "Unknown" : nazwisko;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;

        // zmiana oceny
        if (obecnosc < 50) {
            this.ocena = 2;
        }
    }

    public void setOcena(int ocena) {
        if (this.obecnosc < 50) {
            this.ocena = 2;
        } else {
            this.ocena = ocena;
        }
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko +
                ", indeks: " + numerIndeksu +
                ", obecność: " + obecnosc + "%" +
                ", ocena: " + ocena;
    }
}