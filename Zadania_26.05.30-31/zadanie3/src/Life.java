public class Life extends Insurance {

    public Life() {
        super("life");
    }
    @Override
    public void setCost() {
        super.priceMonthly = 36;
    }
    @Override
    public String display() {
        return "[ insurance type: " + insuranceType + " , monthly fee is: " + priceMonthly + " ]";
    }
}
