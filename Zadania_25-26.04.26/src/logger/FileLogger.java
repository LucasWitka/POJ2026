package logger;

import  java.io.FileWriter;
import java.io.IOException;


public class FileLogger implements Logger {

    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log (
            Severity severity,
            EventSource source,
            String message
    ) {
        try (FileWriter writer = new FileWriter(fileName, true)) {

            writer.write(
                    "[" + severity + "] "
                    + "[" + source + "] "
                    + "[" + message + "]\n"
            );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
