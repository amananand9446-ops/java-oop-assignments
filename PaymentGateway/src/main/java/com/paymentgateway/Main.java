package com.paymentgateway;

public class Main {
    static void main() {
        SMSService smsService = new SMSService();

        PaymentGateway gateway = new PaymentGateway(smsService);

        Payment upiPayment=new UpiPayment();
        gateway.processPayment(upiPayment, 500);

        Payment carPayment=new CardPayment();
        gateway.processPayment(carPayment, 1000);

        Payment walletPayment=new WalletPayment();
        gateway.processPayment(walletPayment, 750);

        Payment  netBankingPayment= new NetBankingPayment();
        gateway.processPayment( netBankingPayment, 2000);
    }
}
