package iks.pttrns.composite;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

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
}
