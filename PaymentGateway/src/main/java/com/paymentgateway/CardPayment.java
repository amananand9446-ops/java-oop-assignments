package com.paymentgateway;

public class CardPayment implements Payment, Refundable{


    @Override
    public void pay(double amount) {
        System.out.println("Payment made using Card: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Card Payment: ₹" + amount);
    }
}