public class Leaf implements Turner {
    //colour can be infinietely expanded
    private String[] colours = {"green", "yellow", "red", "brown"};
    private int colour = 0;

    @Override
    public void turn() {
        if (!(colour == (colours.length - 1))) {
            this.colour += 1;
            System.out.println("Kolor to teraz: " + this.colours[colour]);
        } else {
            //u can also kill the leaf or do something when leaf turns from brown to something.
            this.colour = 0;
            System.out.println("Kolor to teraz: " + this.colours[colour]);
        }
    }
}
