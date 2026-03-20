import java.util.Scanner;


public static boolean palindrom(char[] lit, int dlugosc) {
    for (int i = 0; i < dlugosc / 2; i++){
        if (lit[i] != lit[dlugosc - 1 - i]) {
            return false;
        }
    } return true;
}
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char[] in = new char[100];
    int dlugosc = 0;

    try {
        String slowo1 = sc.next();
        for (int i = 0; i < slowo1.length() && dlugosc < 100; i++) {
            in[dlugosc++] = slowo1.charAt(i);
            }

        if (palindrom(in, dlugosc)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    } catch (Exception exp) {
        System.out.println("BLAD");
    }   finally {
        sc.close();
    }
}


