package com.example.payments;

public class SafeCashAdapter implements PaymentGateway {
    
    SafeCashClient safeCashClient ;
    public SafeCashAdapter(SafeCashClient safeCashClient) {
        this.safeCashClient = safeCashClient;
    }
    public String charge(String customerId, int amountCents) {
        return safeCashClient.createPayment(amountCents, customerId).confirm();
    }
}
