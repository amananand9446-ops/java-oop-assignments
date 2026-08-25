package com.paymentgateway;

public class PaymentGateway {

    private NotificationService notificationService;;
    public PaymentGateway(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    public void processPayment(Payment payment, double amount){
        payment.pay(amount);

        notificationService.sendNotification();
    }
}
