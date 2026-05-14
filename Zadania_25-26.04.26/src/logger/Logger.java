package logger;

public interface Logger {

    void log(
            Severity severity,
            EventSource source,
            String message
    );




}
