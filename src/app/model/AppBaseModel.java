package app.model;

import app.entity.Purchase;

public class AppBaseModel implements AppModel{
   public double calcPayment(Purchase purchase){
        return purchase.getQuota() * purchase.getPrice();
    }
}
