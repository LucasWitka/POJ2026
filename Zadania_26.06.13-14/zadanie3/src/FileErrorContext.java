public class FileErrorContext {
    //actual class to set errors to and to execute associated handling mechanism

    private FileErrorHandler strategy;

    public void setStrategy(FileErrorHandler strategy) {
        this.strategy = strategy;
    }

    public void execute(Exception e) {
        strategy.handle(e);
    }
}