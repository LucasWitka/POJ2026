public class Main {
  public static void main(String[] args) {

    Numbers nums = new Numbers(2, 4, 8);

    System.out.println("Suma: " + nums.sum());
    System.out.println("Średnia: " + nums.average());
    System.out.println("Min: " + nums.min());
    System.out.println("Max: " + nums.max());
    System.out.println("Średnia geometryczna: " + nums.geometric());
  }
}