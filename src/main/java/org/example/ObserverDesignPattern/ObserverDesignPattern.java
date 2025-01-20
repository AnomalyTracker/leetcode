package org.example.leetcode.ObserverDesignPattern;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        station.registerObservers(temperatureDisplay);
        station.registerObservers(phoneDisplay);
        station.setTemperature(30);
        station.removeObservers(temperatureDisplay);
        station.setTemperature(45);
    }
}
