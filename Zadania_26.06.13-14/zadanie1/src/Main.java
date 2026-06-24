import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightSearcher engine = new FlightSearcher();

        engine.addProvider(
                new UAAdapter(new MockUATicketService())
        );

        engine.addProvider(
                new BAAdapter(new MockBATicketService())
        );

        List<Ticket> tickets =
                engine.search(
                        "WARSAW",
                        "LONDON",
                        new Date()
                );

        System.out.println("=== Wszystkie znalezione loty ===");

        tickets.forEach(System.out::println);

        System.out.println("\n=== Sortowanie po cenie ===");

        tickets.stream()
                .sorted(
                        Comparator.comparingDouble(
                                Ticket::getPrice
                        )
                )
                .forEach(System.out::println);

        System.out.println("\n=== Loty bez przesiadek ===");

        tickets.stream()
                .filter(
                        ticket -> ticket.getStops() == 0
                )
                .forEach(System.out::println);

        System.out.println("\n=== Loty krótsze niż 200 minut ===");

        tickets.stream()
                .filter(
                        ticket -> ticket.getDurationMinutes() < 200
                )
                .forEach(System.out::println);

        System.out.println("\n=== Loty tańsze niż 400 PLN ===");

        tickets.stream()
                .filter(
                        ticket -> ticket.getPrice() < 400
                )
                .forEach(System.out::println);
    }
}