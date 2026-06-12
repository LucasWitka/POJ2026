import java.util.Scanner;
void main() {
    System.out.println("What typeof insurance woud you like to see?");
    System.out.println("Health or Life");
    Scanner s = new Scanner(System.in);
    String choice = s.next().toUpperCase();
    if (choice.equals("LIFE")) {
        Life newInsurance = new Life();
        newInsurance.setCost();
        System.out.println(newInsurance.display());
    } else if (choice.equals("HEALTH")) {
        Health newInsurance = new Health();
        newInsurance.setCost();
        System.out.println(newInsurance.display());
    } else {
        System.err.println("WRONG INPUT");
    }
}   