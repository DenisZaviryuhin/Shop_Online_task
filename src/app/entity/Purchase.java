package app.entity;

public class Purchase {
    private final double price;
    private final double quota;

    public Purchase(double quota) {
        this.price = 7.99;
        this.quota = quota;
    }

    public double getPrice() {
        return price;
    }

    public double getQuota() {
        return quota;
    }
}
