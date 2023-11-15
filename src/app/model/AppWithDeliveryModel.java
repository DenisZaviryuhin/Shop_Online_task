package app.model;

import app.entity.Purchase;

public class AppWithDeliveryModel implements AppModel {
    double deliveryCostPercent = 15;

    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuota() * purchase.getPrice();
        double deliveryCost = (cost / 100) * deliveryCostPercent;
        return cost + deliveryCost ;
    }
}
