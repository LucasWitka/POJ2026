
  public class Main {
    public static void main(String[] args) {

      // normalny
      Student s1 = new Student("Kuba", "Skiba", 26990, 80, 4);

      // brak imienia i nazwiska
      Student s2 = new Student("", "", 21370, 90, 5);

      // niska obecność - 2
      Student s3 = new Student("Anna", "Nowak", 24401, 40, 3);

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
    }
  }zSS