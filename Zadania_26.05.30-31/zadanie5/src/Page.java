public class Page implements Turner {
    int pageNumber;

    @Override
    public void turn() {
        this.pageNumber += 1;
        System.out.println("Przeszedles na kolejna strone, jestes teraz na tronie: " + pageNumber);
    }
}
