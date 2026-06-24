import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UAAdapter implements TicketProvider {

    private final UATicketService service;

    public UAAdapter(UATicketService service) {
        this.service = service;
    }

    @Override
    public List<Ticket> search(String from, String to, Date when) {

        return service.getTicketInfo(from, to, when)
                .stream()
                .map(ticket -> new Ticket(
                        "United Airlines",
                        ticket.from,
                        ticket.to,
                        ticket.dateTime,
                        ticket.price,
                        0,
                        180))
                .collect(Collectors.toList());
    }
}