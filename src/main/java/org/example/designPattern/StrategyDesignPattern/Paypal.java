package org.example.leetcode.designPattern.StrategyDesignPattern;

public class Paypal implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid through Paypal");
    }
}
