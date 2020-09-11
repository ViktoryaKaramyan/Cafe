package Menu;

public class Beverage {

    private int beverageID;
    private String beverageName;
    private double beveragePrice;

    public Beverage(int beverageID, String beverageName, double beveragePrice) {
        this.beverageID = beverageID;
        this.beverageName = beverageName;
        this.beveragePrice = beveragePrice;
    }

    public int getBeverageID() {
        return beverageID;
    }

    public void setBeverageID(int beverageID) {
        this.beverageID = beverageID;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public double getBeveragePrice() {
        return beveragePrice;
    }

    public void setBeveragePrice(double beveragePrice) {
        this.beveragePrice = beveragePrice;
    }
}
