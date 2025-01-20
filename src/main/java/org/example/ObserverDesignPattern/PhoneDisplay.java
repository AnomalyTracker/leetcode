package org.example.leetcode.ObserverDesignPattern;

public class PhoneDisplay implements Observer{

    private float temperature;

    @Override
    public void updateTemperature(float temperature) {
        this.temperature = temperature;
        display(temperature);
    }

    private void display(float temperature) {
        System.out.println("current temperature by phone displayer is: "+temperature);
    }
}
