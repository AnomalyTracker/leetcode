package org.example.leetcode.designPattern.StrategyDesignPattern;

public class CreditCard implements PaymentStrategy{
    private int amount;
    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid through Credit card");
    }
}
