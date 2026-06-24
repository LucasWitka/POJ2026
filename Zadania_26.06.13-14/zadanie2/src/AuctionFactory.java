public class AuctionFactory {

    public enum Type {
        SIMPLE,
        EXTENDED,
        REVERSE
    }

    public static Auction createAuction(Type type, String name, String desc,
                                        double price, int duration,
                                        int minTrust, User seller) {

        return switch (type) {
            case SIMPLE -> new AukcjaProsta(name, desc, price, duration, minTrust, seller);
            case EXTENDED -> new AukcjaWydluzana(name, desc, price, duration, minTrust, seller);
            case REVERSE -> new AukcjaOdwrotna(name, desc, price, duration, minTrust, seller);
        };
    }
}