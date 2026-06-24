import java.time.LocalDateTime;

public class Ticket {
    private String airline;
    private String from;
    private String to;
    private LocalDateTime departureTime;
    private double price;
    private int stops;
    private int durationMinutes;

    public Ticket(String airline,
                  String from,
                  String to,
                  LocalDateTime departureTime,
                  double price,
                  int stops,
                  int durationMinutes) {

        this.airline = airline;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.price = price;
        this.stops = stops;
        this.durationMinutes = durationMinutes;
    }

    public double getPrice() {
        return price;
    }

    public int getStops() {
        return stops;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return airline +
                " | " + from +
                " -> " + to +
                " | cena=" + price +
                " | przesiadki=" + stops +
                " | czas=" + durationMinutes + " min";
    }
}