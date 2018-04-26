package iks.pttrns.composite;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quack) {
        System.out.println("Quackologist: " + quack + " just quacked");
    }
}
