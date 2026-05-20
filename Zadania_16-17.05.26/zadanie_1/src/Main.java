void main() {
    MyPoint[] points = new MyPoint[10];

    for (int i = 0; i < 10; i++) {
        points[i] = new MyPoint(i + 1, i + 1);
    }

    for (MyPoint p : points) {
        System.out.println(p);
    }
}
