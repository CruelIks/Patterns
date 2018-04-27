package iks.pttrns.composite;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> quackFlock = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable quackable : quackFlock) {
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable : quackFlock) {
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quackable : quackFlock) {
            quackable.notifyObservers();
        }
    }

    public void addQuack(Quackable quack) {
        this.quackFlock.add(quack);
    }
}
