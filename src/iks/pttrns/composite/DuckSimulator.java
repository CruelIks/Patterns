package iks.pttrns.composite;

import iks.pttrns.composite.factory.AbstractDuckFactory;
import iks.pttrns.composite.factory.CountDuckFactory;

public class DuckSimulator {
    public DuckSimulator() {
    }

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    public void simulate() {
        AbstractDuckFactory countFactory = new CountDuckFactory();
        Quackable mallardDuck = countFactory.createMallardDuck();
        Quackable rubberDuck = countFactory.createRubberDuck();

        Flock ducksFlock = new Flock();
        ducksFlock.add(mallardDuck);
        ducksFlock.add(rubberDuck);
        ducksFlock.quack();

        System.out.println(QuackCounter.getQuackCount() + " quack's");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }


}
