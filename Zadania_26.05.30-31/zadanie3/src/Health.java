public class Health extends Insurance {

    public Health() {
        super("health");
    }
    @Override
    public void setCost() {
        super.priceMonthly = 196;
    }
    @Override
    public String display() {
        return "[ insurance type: " + insuranceType + " , monthly fee is: " + priceMonthly + " ]";
    }
}
