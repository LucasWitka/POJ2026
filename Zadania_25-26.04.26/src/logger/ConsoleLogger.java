package logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(
            Severity severity,
            EventSource source,
            String message
    ) {
        System.out.println(
                "[" + severity + "] "
                + "[" + source + "] "
                + "[" + message + "] "
        );
    }




}
