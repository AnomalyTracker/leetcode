package org.example.leetcode.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observers = new ArrayList<>();
    private float temperature;
    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.updateTemperature(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
}
