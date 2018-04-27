package iks.pttrns.composite.factory;

import iks.pttrns.composite.DuckCall;
import iks.pttrns.composite.MallardDuck;
import iks.pttrns.composite.Observable;
import iks.pttrns.composite.Quackable;
import iks.pttrns.composite.RedheadDuck;
import iks.pttrns.composite.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
