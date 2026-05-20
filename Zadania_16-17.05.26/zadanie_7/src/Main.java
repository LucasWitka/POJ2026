import java.util.Arrays;

void main() {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int n = sc.nextInt();

    int[] grades = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter the grade for student " + (i + 1) + ": ");
        grades[i] = sc.nextInt();
    }

    System.out.println("The grades are: " + Arrays.toString(grades));

    double sum = 0;

    for (int grade : grades) {
        sum += grade;
    }

    double average = sum / n;

    System.out.printf("The average is: " + "%.2f%n", average);

    Arrays.sort(grades);

    double mediana;
    if (n % 2 == 0) {
        mediana = (grades[n / 2 - 1] + grades[n / 2]) / 2.0;
    } else {
        mediana = grades[n / 2];
    }

    System.out.printf("The median is: " + "%.2f%n", mediana);

    System.out.println("The minimum is: " + grades[0]);
    System.out.println("The maximum is: " + grades[n - 1]);

    double squareSum = 0;

    for (int grade : grades) {
        squareSum += Math.pow(grade - average, 2);
    }
    double standardDeviation = Math.sqrt(squareSum / n);

    System.out.printf("The standard deviation is: " + "%.2f%n", standardDeviation);

}