public class CompassPoint implements Turner{
    private String[] points = {"polnoc", "wschod", "poludnie", "zachod"};
    private int point = 0;

    @Override
    public void turn() {
        if (!(point == 3)) {
            this.point += 1;
            System.out.println("Kolor to teraz: " + this.points[point]);
        } else {
            //u can also kill the leaf or do something when leaf turns from brown to something.
            this.point = 0;
            System.out.println("Kolor to teraz: " + this.points[point]);
        }
    }}
