package iks.pttrns.composite;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

    QuackObservable duck;
    List<Observer> observers = new ArrayList<>();

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
}
