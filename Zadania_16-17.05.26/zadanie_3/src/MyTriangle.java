public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + this.v1.toString() + ",v2="
                + this.v2.toString() + ",v3="
                + this.v3.toString() + "]";
    }

    public double getPerimeter() {
        return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
    }

    //equaliteral = rownoboczny
    //isosceles = rownoramienny
    //scalene = roznoboczny (wszystkie boki innej dlugosci)
    public String getType() {
        double a = this.v1.distance(v2);
        double b = this.v2.distance(v3);
        double c = this.v3.distance(v1);

        if (a == b && b == c && c == a) {
            return "equaliteral";
        } else if (a == b || a == c || b == c) {
            return "isosceles";
        } else return "scalene";
    }

}
