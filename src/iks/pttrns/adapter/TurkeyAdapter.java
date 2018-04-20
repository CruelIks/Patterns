package iks.pttrns.adapter;

public class TurkeyAdapter implements Turkey {
    Duck duck;

    public TurkeyAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
