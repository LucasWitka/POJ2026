void main() {
    //points
    MyPoint pointA = new MyPoint(4, 4);
    MyPoint pointB = new MyPoint(1, 1);
    MyPoint pointC = new MyPoint(8, 6);
    MyPoint pointD = new MyPoint();

    //test toString
    System.out.println(pointB);

    MyCircle a = new MyCircle(2, 2, 4);
    MyCircle b = new MyCircle(pointA, 2);

    System.out.println(a.getArea());
    System.out.println(b.getRadius());
    b.setRadius(10);
    System.out.println(b.getRadius());
    System.out.println(b.distance(a));
    System.out.println(a);
}