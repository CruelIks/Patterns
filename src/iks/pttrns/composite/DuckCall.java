package iks.pttrns.composite;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("duck duck");
    }
}
