package app;

import app.controller.AppController;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        runOption(getOption());


    }

    private static int getOption() {
        System.out.println("""
                Shop Online
                "All for 7.99"
                -----------
                Choose order option:
                1 - Order with pickup.
                2 - Order with delivery.
                """);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runOption(int option) {
        switch (option) {
            case 1 -> {
                AppController appController = new AppController();
                appController.getPayment();
            }
            case 2 -> {
                AppController appController = new AppController();
                appController.getPaymentWithDelivery();
            }
        }


    }
}
