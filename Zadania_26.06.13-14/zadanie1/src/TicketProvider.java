import java.util.Date;
import java.util.List;

public interface TicketProvider {
    List<Ticket> search(String from, String to, Date when);
}