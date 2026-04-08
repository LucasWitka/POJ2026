public class Main {
  public static void main(String[] args) {

    Invoice invoice1 = new Invoice("A123", "Mysz komputerowa", 5, 25.50);
    Invoice invoice2 = new Invoice("B456", "Klawiatura", 0, 100.0);   // quantity = 0
    Invoice invoice3 = new Invoice("C789", "Monitor", 2, -300.0);     // price < 0

    System.out.println(invoice1.getProductDescription() + " - Amount: " + invoice1.amount());
    System.out.println(invoice2.getProductDescription() + " - Amount: " + invoice2.amount());
    System.out.println(invoice3.getProductDescription() + " - Amount: " + invoice3.amount());
  }
}