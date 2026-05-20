public class MyRectangle {
    private MyPoint topL; //left up
    private MyPoint botR; //bot right

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topL = new MyPoint(x1, y1);
        this.botR = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topL, MyPoint botR) {
        this(topL.getX(), topL.getY(), botR.getX(), botR.getY());
    }

    //all points getters
    public MyPoint getTopL() {
        return new MyPoint(topL.getX(), topL.getY());
    }

    public MyPoint getTopR() {
        return new MyPoint(botR.getX(), topL.getY());
    }

    public MyPoint getBotR() {
        return new MyPoint(botR.getX(), botR.getY());
    }

    public MyPoint getBotL() {
        return new MyPoint(topL.getX(), botR.getY());
    }
    //brak setterow, nie mozesz zmienic prostokata po stworzeniu go.

    public double getPerimeter() {
        double a = topL.distance(getTopR());
        double b = topL.distance(getBotL());
        return 2 * (a + b);
    }

    public double getArea() {
        double a = topL.distance(getTopR());
        double b = topL.distance(getBotL());
        return a * b;
    }

    @Override
    public String toString() {
        return "MyRectangle[topL=" + topL.toString()
                + ",botR=" + botR.toString() + "]";
    }
}
