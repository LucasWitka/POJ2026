import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ilDanych = 3;
    double[] dane = new double[ilDanych];

    for (int i = 0; i < ilDanych; i++){
        dane[i] = sc.nextDouble();
    }
    for (int i = 0; i < ilDanych - 1; i++) {
        for (int j = 0; j < ilDanych - 1 - i; j++){
            if (dane[j] > dane[j + 1]) {
                double a = dane[j];
                dane[j] = dane[j + 1];
                dane[j + 1] = a;
            }
        }
    }
    for (int i = 0; i<ilDanych; i++){
        System.out.printf("%.6f ", dane[i]);
    }
    System.out.println();
    for (int i = ilDanych - 1; i >= 0; i--){
        System.out.printf("%.6f ", dane[i]);
    }
    sc.close();


}


