import java.util.*;

public class AuctionSystem {

    private List<Auction> auctions = new ArrayList<>();

    public void addAuction(Auction auction) {
        auctions.add(auction);
    }

    public void nextRound() {
        for (Auction a : auctions) {
            a.nextRound();
        }
    }

    public List<Auction> getActiveAuctions() {
        return auctions.stream()
                .filter(a -> !a.isFinished())
                .toList();
    }

    public List<Auction> getFinishedAuctions() {
        return auctions.stream()
                .filter(Auction::isFinished)
                .toList();
    }

    public List<Auction> getAuctionsBySeller(String login) {
        return auctions.stream()
                .filter(a -> a.getSeller().getLogin().equals(login))
                .toList();
    }
}