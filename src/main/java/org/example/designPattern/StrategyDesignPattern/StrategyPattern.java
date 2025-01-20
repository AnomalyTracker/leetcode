package org.example.leetcode.designPattern.StrategyDesignPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCard());
        context.executePayment(5000);
        context.setPaymentStrategy(new Paypal());
        context.executePayment(6000);
    }
}
