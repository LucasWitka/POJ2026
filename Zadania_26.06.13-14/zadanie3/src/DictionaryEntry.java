public class DictionaryEntry {

    private long id;
    private int intKey;
    private String stringKey;
    private String value;
    private String enumerationName;

    public DictionaryEntry(long id, int intKey, String stringKey,
                           String value, String enumerationName) {
        this.id = id;
        this.intKey = intKey;
        this.stringKey = stringKey;
        this.value = value;
        this.enumerationName = enumerationName;
    }

    public long getId() {
        return id;
    }

    public int getIntKey() {
        return intKey;
    }

    public String getStringKey() {
        return stringKey;
    }

    public String getValue() {
        return value;
    }

    public String getEnumerationName() {
        return enumerationName;
    }
}