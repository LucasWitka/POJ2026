import java.util.*;
import java.util.concurrent.*;

public class DictionaryCache {

    private static DictionaryCache instance;

    private final DictionaryDataSource dataSource;

    private List<DictionaryEntry> cache = new ArrayList<>();

    private DictionaryCache(DictionaryDataSource dataSource) {
        this.dataSource = dataSource;
        refresh();
        startAutoRefresh();
    }

    //synchronized po to aby jesli kilka funkcji prosi o ,,instance'' -> cache,
    // to nie moga prosic na raz i wykonywac na raz na cache instrukcji.
    // jako ze cache jest jedno to musi byc dostepne na raz tylko dla jednego threadu.
    public static synchronized DictionaryCache getInstance(
            DictionaryDataSource dataSource) {

        if (instance == null) {
            instance = new DictionaryCache(dataSource);
        }

        return instance;
    }

    public void refresh() {
        cache = dataSource.loadData();
        System.out.println("Cache odświeżony");
    }

    public List<DictionaryEntry> getAll() {
        return cache;
    }

    //biblioteka .concurent zawierajaca klasy zasjmujace sie egzekucja podanych im zadan
    //jako osobny thread.
    private void startAutoRefresh() {

        ScheduledExecutorService executor =
                Executors.newSingleThreadScheduledExecutor();

        executor.scheduleAtFixedRate(
                this::refresh,
                5,
                5,
                TimeUnit.MINUTES
        );
    }

    public DictionaryEntry findByIntKey(
            String enumerationName,
            int intKey) {

        return cache.stream()
                .filter(e -> e.getEnumerationName()
                        .equals(enumerationName))
                .filter(e -> e.getIntKey() == intKey)
                .findFirst()
                .orElse(null);
    }

    public DictionaryEntry findByStringKey(
            String enumerationName,
            String stringKey) {

        return cache.stream()
                .filter(e -> e.getEnumerationName()
                        .equals(enumerationName))
                .filter(e -> e.getStringKey()
                        .equals(stringKey))
                .findFirst()
                .orElse(null);
    }


}