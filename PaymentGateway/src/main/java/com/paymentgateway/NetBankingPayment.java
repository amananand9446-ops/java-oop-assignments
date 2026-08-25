package com.paymentgateway;

public class NetBankingPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment made using Net Banking: ₹" + amount);
    }
}
