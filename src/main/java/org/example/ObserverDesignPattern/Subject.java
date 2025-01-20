package org.example.leetcode.ObserverDesignPattern;

public interface Subject {
    void registerObservers(Observer observer);
    void removeObservers(Observer observer);
    void notifyObserver();
}
