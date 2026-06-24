public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String email;
    private int trustPoints;

    public User(String firstName, String lastName, String login, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.trustPoints = 0;
    }

    public void addTrustPoint() {
        trustPoints++;
    }

    public void removeTrustPoint() {
        trustPoints--;
    }

    public int getTrustPoints() {
        return trustPoints;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}