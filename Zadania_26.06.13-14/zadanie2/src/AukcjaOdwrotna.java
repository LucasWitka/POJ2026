public class AukcjaOdwrotna extends Auction {

    private double currentPrice;

    public AukcjaOdwrotna(String name,
                           String description,
                           double priceStart,
                           int duration,
                           int minTrustPoints,
                           User seller) {

        super(name, description, priceStart, duration, minTrustPoints, seller);
        this.currentPrice = priceStart;
    }

    @Override
    public void placeBid(User user, double amount) {
        if (isOver) {
            return;
        }
        if (user.getTrustPoints() < minTrustPoints) {
            return;
        }

        currentPrice -= 1;

        if (currentPrice <= 0) {
            bids.add(new Bid(user, 0, roundCurrent));
            finish();
            return;
        }

        bids.add(new Bid(user, currentPrice, roundCurrent));
    }
}
