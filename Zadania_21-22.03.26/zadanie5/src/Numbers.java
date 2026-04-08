public class Numbers {

    private int a;
    private int b;
    private int c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return (a + b + c) / 3.0;
    }

    public int min() {
        return Math.min(a, Math.min(b, c));
    }

    public int max() {
        return Math.max(a, Math.max(b, c));
    }
    // średnia geometryczna
    public double geometric() {
        return Math.cbrt(a * b * c); // pierwiastek sześcienny
    }
}