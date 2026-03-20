import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    while (true){
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n > 0) break;
        }   else {
            sc.next();
        }
    }
    for (int i = 0; i < n; i++) {
            System.out.print("`");
    }
    for (int i = 0; i <= n; i++){
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n; i >= 1; i--){
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n; i >= 1; i--){
        for (int k = 0; k < n - i; k++){
            System.out.print(" ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 1; i <= n; i++){
        for (int k = 0; k < n - i; k++){
            System.out.print(" ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 0; i < n; i++) {
        System.out.print("`");
    }
    //nie wiem czy mialy byc "`" ale dodałem w razie co
}


