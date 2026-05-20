void main() {
    Customer customer1 = new Customer(1234, "Adam", 0);
    Invoice invoice1 = new Invoice(1234, customer1, 123.50);
    System.out.println(invoice1.getCustomerName());
    System.out.println(invoice1.getAmountAfterDiscount());
    customer1.setDiscount(10);
    System.out.println("Changed customers discount to 10%");
    System.out.println(invoice1.getAmountAfterDiscount());
}