package iks.pttrns.strategy;

public class Manok {
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }
}
