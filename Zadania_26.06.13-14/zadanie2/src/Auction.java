import java.util.*;

public abstract class Auction {
    protected String name;
    protected String description;
    protected double startingPrice;
    protected int roundsDuration;
    protected int roundCurrent = 0;
    protected int minTrustPoints;

    protected boolean isOver = false;

    protected User seller;
    protected List<Bid> bids = new ArrayList<>();

    public Auction(String name,
                   String description,
                   double startingPrice,
                   int roundsDuration,
                   int minTrustPoints,
                   User seller) {

        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.roundsDuration = roundsDuration;
        this.minTrustPoints = minTrustPoints;
        this.seller = seller;
    }

    public abstract void placeBid(User user, double amount);

    public void nextRound() {
        roundCurrent++;
        if (roundCurrent >= roundsDuration) {
            finish();
        }
    }

    public Bid hihgestBid() {
        return bids.stream()
                .max((b1, b2) -> Double.compare((b1.getAmount()), b2.getAmount()))
                .orElse(null);
    }

    public void finish() {
        isOver = true;
    }

    public boolean isFinished() {
        return isOver;
    }

    public User getSeller() {
        return seller;
    }

}
