import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightSearcher {

    private final List<TicketProvider> providers = new ArrayList<>();

    public void addProvider(TicketProvider provider) {
        providers.add(provider);
    }

    public List<Ticket> search(
            String from,
            String to,
            Date when) {

        List<Ticket> result = new ArrayList<>();

        for (TicketProvider provider : providers) {
            result.addAll(
                    provider.search(from, to, when)
            );
        }

        return result;
    }
}