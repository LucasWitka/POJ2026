import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= 0 || m <= 0 || n != m ){
            System.out.println("BLAD");
            return;
        }
        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }

        int il = 0;
        for (int i = 0; i < n; i++){
            il += A[i] * B[i];
        }
        System.out.println(il);

    } catch (Exception exp){
        System.out.println("BLAD");
    }

}


