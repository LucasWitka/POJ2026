import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean isValid = false;
    int in = 0;
    do {
        System.out.println("Podaj liczbe(z zakresu 1-12):");
        try {
            in = sc.nextInt();
            isValid = true;
        } catch (Exception errIn) {
            sc.next();
        }
        if (!isValid) {
            System.out.println("BLAD");
        } else if (!(in >= 1 && in <= 12)) {
            System.out.println("PODAJ LICZBE OD 1 - 12!" + '\n');
            isValid = false;
        }
    } while (!isValid);
    switch (in) {
        case 1:
            System.out.println("Styczen: 31 dni");
            break;
        case 2:
            System.out.println("Luty: 28 dni");
            break;
        case 3:
            System.out.println("Marzec: 31 dni");
            break;
        case 4:
            System.out.println("Kwiecien: 30 dni");
            break;
        case 5:
            System.out.println("Maj: 31 dni");
            break;
        case 6:
            System.out.println("Czerwiec: 30 dni");
            break;
        case 7:
            System.out.println("Lipiec: 31 dni");
            break;
        case 8:
            System.out.println("Sierpien: 31 dni");
            break;
        case 9:
            System.out.println("Wrzesien: 30 dni");
            break;
        case 10:
            System.out.println("Pazdziernik: 31 dni");
            break;
        case 11:
            System.out.println("Listopad: 30 dni");
            break;
        case 12:
            System.out.println("Grudzien: 31 dni");
            break;
    }
    }

//    for (int i = 0; i < check.length; i++) {
//        try {
//            check[i] = Integer.parseInt(in[i]);
//        } catch (NumberFormatException nfe) {
//            isValid = false;
//        }
//    }

