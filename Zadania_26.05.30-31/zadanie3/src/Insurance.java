public abstract class Insurance {

    protected String insuranceType;
    protected double priceMonthly;

    public Insurance(String type) {
        this.insuranceType = type;
    }
    //getters
    public String getInsuranceType() {
        return insuranceType;
    }
    public double getPriceMonthly() {
        return priceMonthly;
    }

    public abstract void setCost();

    public abstract String display();
}
