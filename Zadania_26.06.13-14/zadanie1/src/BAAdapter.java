import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BAAdapter implements TicketProvider {

    private final BATicketService service;

    public BAAdapter(BATicketService service) {
        this.service = service;
    }

    @Override
    public List<Ticket> search(String from, String to, Date when) {

        Airport fromAirport = new Airport();
        fromAirport.airportCode = from;

        Airport toAirport = new Airport();
        toAirport.airportCode = to;

        return service.getTicketInfo(fromAirport, toAirport, when)
                .stream()
                .map(ticket -> new Ticket(
                        "British Airways",
                        from,
                        to,
                        ticket.departureTime,
                        ticket.ticketPrice,
                        1,
                        220))
                .collect(Collectors.toList());
    }
}