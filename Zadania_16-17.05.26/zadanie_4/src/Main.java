void main() {
    //points
    MyPoint pointA = new MyPoint(0, 4);
    MyPoint pointB = new MyPoint(10, 1);
    MyPoint pointC = new MyPoint(8, 6);
    MyPoint pointD = new MyPoint();

    MyRectangle RectA = new MyRectangle(pointA,pointB);
    System.out.println(RectA);
    System.out.println(RectA.getTopR());
    System.out.println(RectA.getPerimeter());
    System.out.println();
}