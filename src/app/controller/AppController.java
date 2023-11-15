package app.controller;

import app.entity.Client;
import app.entity.Purchase;
import app.model.AppBaseModel;
import app.model.AppWithDeliveryModel;
import app.utility.Rounder;
import app.view.AppView;

public class AppController {
    private final String CURRENCY = "USD";

    public void getPayment() {
        AppView view = new AppView();
        String[] data = view.getData();
        Client client = getClient(data);
        Purchase purchase = getPurchase(data);
        String output;
        AppBaseModel model = new AppBaseModel();
        String payment = Rounder.roundValue(model.calcPayment(purchase));
        output = "\nClient: " + client.getName() + "\nPhone number: " + client.getPhone() +
                "\nPayment is " + CURRENCY + " " + payment;
        view.getOutput(output);


    }

    public void getPaymentWithDelivery() {
        AppView view = new AppView();
        String[] data = view.getData();
        Client client = getClient(data);
        Purchase purchase = getPurchase(data);
        String output;
        AppWithDeliveryModel deliveryModel = new AppWithDeliveryModel();
        String paymentWithDelivery = Rounder.roundValue(deliveryModel.calcPayment(purchase));
        output = "\nClient: " + client.getName() + "\nPhone number: " + client.getPhone() +
                "\nPayment with delivery is " + CURRENCY + " " + paymentWithDelivery;
        view.getOutput(output);
    }

    private Client getClient(String[] data) {
        return new Client(data[0], data[1]);
    }

    private Purchase getPurchase(String[] data) {
        return new Purchase(Integer.parseInt(data[2]));

    }
}
