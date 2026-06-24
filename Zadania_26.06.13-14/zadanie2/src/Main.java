void main() {
    //users
    User seller = new User("Kuba", "Kowalski", "kuba89", "kuba@test.com");
    User buyer = new User("Ben", "Derbak", "bonito7", "bonitkiBen@test.com");

    buyer.addTrustPoint();
    buyer.addTrustPoint();

    Auction simpleAuction = AuctionFactory.createAuction(
            AuctionFactory.Type.SIMPLE,
            "Laptop",
            "Gamingowy laptop wart cale twoje oszczednosci, totalnie go chcesz",
            2000,
            4,
            1,
            seller
    );

    Auction extendedAuction = AuctionFactory.createAuction(
            AuctionFactory.Type.EXTENDED,
            "Telefon",
            "Smartfon Android",
            1500,
            2,
            1,
            seller
    );

    AuctionSystem system = new AuctionSystem();
    system.addAuction(simpleAuction);
    system.addAuction(extendedAuction);

    System.out.println("AUKCJA PROSTA");
    simpleAuction.placeBid(buyer, 2100);
    System.out.println(simpleAuction.hihgestBid());

    System.out.println("AUKCJA PRZEDLUZANA");
    extendedAuction.placeBid(buyer, 1600);
    System.out.println(extendedAuction.hihgestBid());

    System.out.println("\n===KOLEJNA RUNDA===");
    system.nextRound();

    System.out.println("AUKCJA PROSTA");
    simpleAuction.placeBid(buyer, 3677);
    System.out.println(simpleAuction.hihgestBid());


    System.out.println("\n=== ACTIVE AUCTIONS ===");
    system.getActiveAuctions().forEach(a -> System.out.println(a.name));

    System.out.println("\n===KOLEJNA RUNDA===");
    system.nextRound();
    System.out.println("\n===KOLEJNA RUNDA===");
    system.nextRound();

    System.out.println("\n=== FINISHED AUCTIONS ===");
    system.getFinishedAuctions().forEach(a -> System.out.println(a.name));

}