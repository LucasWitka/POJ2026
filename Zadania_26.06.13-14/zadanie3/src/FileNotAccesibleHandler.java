public class FileNotAccesibleHandler implements FileErrorHandler {

    @Override
    public void handle(Exception e) {
        System.out.println("Błąd: plik jest aktualnie używany.");
    }
}