package iks.pttrns.composite.factory;

import iks.pttrns.composite.DuckCall;
import iks.pttrns.composite.MallardDuck;
import iks.pttrns.composite.QuackCounter;
import iks.pttrns.composite.Quackable;
import iks.pttrns.composite.RedheadDuck;
import iks.pttrns.composite.RubberDuck;

public class CountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
