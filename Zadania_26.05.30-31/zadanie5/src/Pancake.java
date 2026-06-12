public class Pancake implements Turner{
    //strona albo 0 albo 1. bo nalesnik ma tylko 2 strony.
    private int strona = 0;

    @Override
    public void turn() {
        if (strona == 0) {
            this.strona = 1;
            System.out.println("Jestes teraz na drugiej stronie nalesnika, dobry flip!");
        } else {
            this.strona = 0;
            System.out.println("Jestes teraz na pierwszej stronie nalesnika, dobry flip!");
        }
    }
}
