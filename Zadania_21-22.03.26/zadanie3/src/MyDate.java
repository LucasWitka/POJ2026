public class MyDate {

    private int day;
    private int month;
    private int year;

    // konstruktor
    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // GETTERY
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // SETTERY z wyjątkami
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Niepoprawny dzień!");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Niepoprawny miesiąc!");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2050) {
            throw new IllegalArgumentException("Niepoprawny rok!");
        }
        this.year = year;
    }

    // metoda wyświetlania daty
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}