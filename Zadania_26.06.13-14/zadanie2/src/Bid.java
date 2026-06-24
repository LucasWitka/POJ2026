public class Bid {
    private User user;
    private double amount;
    private int bidRound;

    public Bid(User user, double amount, int bidRound) {
        this.user = user;
        this.amount = amount;
        this.bidRound = bidRound;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public int getRound() {
        return bidRound;
    }
    @Override
    public String toString() {
        return "| " + user + " | amount: " + amount + " | round: " + bidRound + " |";
    }
}
