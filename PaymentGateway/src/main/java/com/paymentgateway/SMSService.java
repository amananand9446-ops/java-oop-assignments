package com.paymentgateway;

public class SMSService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS sent to Customer");
    }
}
