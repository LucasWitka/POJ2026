public class AukcjaWydluzana extends Auction {
//prosta – wygrywa licytujący, który złożył najwyższą ofertę w ostatniej rundzie,

    public AukcjaWydluzana(String name,
                           String description,
                           double priceStart,
                           int duration,
                           int minTrustPoints,
                           User seller) {

        super(name, description, priceStart, duration, minTrustPoints, seller);
    }

    @Override
    public void placeBid(User user, double amount) {
        if (isOver) {
            return;
        }
        if (user.getTrustPoints() < minTrustPoints) {
            return;
        }
        bids.add(new Bid(user, amount, roundCurrent));
        roundsDuration++;
    }

}
