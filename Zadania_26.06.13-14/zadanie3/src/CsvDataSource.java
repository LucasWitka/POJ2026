import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CsvDataSource implements DictionaryDataSource {

    private final String fileName;

    public CsvDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<DictionaryEntry> loadData() {

        List<DictionaryEntry> result = new ArrayList<>();
        FileErrorContext context = new FileErrorContext();

        try {

            List<String> lines = Files.readAllLines(Paths.get(fileName));

            for (String line : lines) {

                String[] parts = line.split(";");

                if (parts.length != 5) {
                    throw new IllegalArgumentException("Invalid data");
                }

                result.add(
                        new DictionaryEntry(
                                Long.parseLong(parts[0]),
                                Integer.parseInt(parts[1]),
                                parts[2],
                                parts[3],
                                parts[4]
                        )
                );
            }

        } catch (NoSuchFileException e) {

            context.setStrategy(new FileNotFoundHandler());
            context.execute(e);

        } catch (IllegalArgumentException e) {

            context.setStrategy(new InvalidDataHandler());
            context.execute(e);

        } catch (IOException e) {

            context.setStrategy(new FileNotAccesibleHandler());
            context.execute(e);
        }

        return result;
    }
}