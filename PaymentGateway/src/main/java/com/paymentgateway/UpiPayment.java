package com.paymentgateway;

public class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment mode using UPI: ₹" + amount);
    }
}
