
public class Main {
  public static void main(String[] args) {

    // konstruktor domyślny
    Clock c1 = new Clock();
    System.out.println(c1);

    System.out.println();
    // konstruktor z parametrami
    Clock c2 = new Clock(23, 59, 59);
    System.out.println(c2);

    // tick (powinno przejść na 00:00:00)
    c2.tick();
    System.out.println(c2);

    System.out.println();
    // konstruktor z sekund
    Clock c3 = new Clock(3792);
    System.out.println(c3);

    // tickDown
    c3.tickDown();
    System.out.println(c3);
  }
}