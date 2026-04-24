import java.util.ArrayList;

public class ParkMaszynowy {
    public static void main(String[] args) {

        ArrayList<Maszyna> maszyny = new ArrayList<>();

        maszyny.add(new Lokomotywa("PESA", "Gama", 16.0,
                RodzajSilnika.SPALINOWY, 3000, 20));

        Kosiarka k1 = new Kosiarka("Honda", "HRX", 2.0,
                RodzajSilnika.SPALINOWY, true, true, 2);

        maszyny.add(k1);

        maszyny.add(new Samochod("Toyota", "Corolla", 1.8,
                RodzajSilnika.HYBRYDOWY, 140, 190,
                Segment.C, "VIN123"));

        maszyny.add(new Jednoslad("Kross", "Hexagon",
                TypJednosladu.ROWER));

        for (Maszyna m : maszyny) {
            m.wyswietl();
            System.out.println();
        }

        k1.setLiczbaOstrzy(4);
        k1.wyswietl();
    }
}