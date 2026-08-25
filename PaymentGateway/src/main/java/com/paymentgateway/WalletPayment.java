package com.paymentgateway;

public class WalletPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment made using Wallet: ₹" + amount);
    }
}
