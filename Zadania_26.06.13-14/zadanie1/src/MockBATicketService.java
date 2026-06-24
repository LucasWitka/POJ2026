import java.util.Date;
import java.util.List;

public class MockBATicketService implements BATicketService {

    @Override
    public List<BATicket> getTicketInfo(
            Airport from,
            Airport to,
            Date when) {

        BATicket t1 = new BATicket();
        t1.ticketPrice = 500;

        BATicket t2 = new BATicket();
        t2.ticketPrice = 350;

        return List.of(t1, t2);
    }
}