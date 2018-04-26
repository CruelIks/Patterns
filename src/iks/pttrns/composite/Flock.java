package iks.pttrns.composite;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    Observable observable;

    public Flock(Observable observable) {
        this.observable = observable;
    }

    List<Quackable> flock = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable quackable : flock) {
            quackable.quack();
        }
    }

    public void add(Quackable quackable) {
        flock.add(quackable);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
