
public class Main {
  public static void main(String[] args) {

    try {
      MyDate d1 = new MyDate(21, 3, 2025);
      d1.displayDate();

      MyDate d2 = new MyDate(5, 1, 2000);
      d2.displayDate();

      // tutaj będzie błąd
      MyDate d3 = new MyDate(40, 15, 1800);
      d3.displayDate();

    } catch (IllegalArgumentException e) {
      System.out.println("Błąd: " + e.getMessage());
    }
  }
}