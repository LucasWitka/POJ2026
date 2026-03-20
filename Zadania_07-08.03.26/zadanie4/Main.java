import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj 3 dlugosci bokow:");
    while (!sc.hasNext()) {
        System.out.println("BLAD");
        sc.next();
    }
    String[] in = sc.nextLine().split(" ");
    int[] check = new int[in.length];
    boolean isValid = true;
    for (int i = 0; i < check.length; i++) {
        try {
            check[i] = Integer.parseInt(in[i]);
        } catch (NumberFormatException nfe) {
            isValid = false;
        }
    }
    for (int i = 0; i < check.length; i++) {
        if (!(check[i]>0)) {
            isValid = false;
            break;
        }
    }
    if (!isValid) {
        System.out.println("BLAD");
    } else {
        if ((check[0]+check[1])>check[2] && (check[2]+check[1])>check[0] && (check[0]+check[2])>check[1]){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

}

