void main() {
    //points
    MyPoint pointA = new MyPoint(4, 4);
    MyPoint pointB = new MyPoint(1, 1);
    MyPoint pointC = new MyPoint(8, 6);
    MyPoint pointD = new MyPoint();

    //test toString
    System.out.println(pointB);

    MyTriangle triA = new MyTriangle(pointA,pointB,pointC);

    System.out.println(triA);
    System.out.println(triA.getType());
}