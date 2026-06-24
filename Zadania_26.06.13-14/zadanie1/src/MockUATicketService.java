import java.util.Date;
import java.util.List;

public class MockUATicketService implements UATicketService {

    @Override
    public List<UATicketInfo> getTicketInfo(
            String from,
            String to,
            Date when) {

        UATicketInfo t1 = new UATicketInfo();
        t1.from = from;
        t1.to = to;
        t1.price = 450;

        UATicketInfo t2 = new UATicketInfo();
        t2.from = from;
        t2.to = to;
        t2.price = 390;

        return List.of(t1, t2);
    }
}