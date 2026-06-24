void main() {

    DictionaryDataSource source = new CsvDataSource("dictionary.csv");

    DictionaryCache cache = DictionaryCache.getInstance(source);

    DictionaryEntry city = cache.findByStringKey("City", "GD");
    DictionaryEntry region = cache.findByStringKey("Region", "POM");
    if (city != null) {
        System.out.println(city.getValue());
        System.out.println(region.getValue());
    }
}