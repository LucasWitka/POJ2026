public class InvalidDataHandler implements FileErrorHandler {

    @Override
    public void handle(Exception e) {
        System.out.println("Błąd: niepoprawny format danych.");
    }
}