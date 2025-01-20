package org.example.leetcode.ObserverDesignPattern;

public class TemperatureDisplay implements Observer{
    private float temperature;

    @Override
    public void updateTemperature(float temperature) {
        this.temperature = temperature;
        diplay(temperature);
    }

    private void diplay(float temperature) {
        System.out.println("current temperature by temperatureDisplayer:  "+temperature);
    }
}
