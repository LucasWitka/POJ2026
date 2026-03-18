import java.util.Scanner;

public static void main(String[] args) {
    Scanner getString = new Scanner(System.in);
    System.out.println("Podaj 2 ciagi tekstowe:");
    String a = getString.nextLine();
    String[] b = a.split(" ");
    System.out.println("\"%" + b[1] + " " + b[0] + "%\"");
}

