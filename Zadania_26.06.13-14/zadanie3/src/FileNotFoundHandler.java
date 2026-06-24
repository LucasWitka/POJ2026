public class FileNotFoundHandler implements FileErrorHandler {

    @Override
    public void handle(Exception e) {
        System.out.println("Błąd: nie znaleziono pliku.");
    }
}