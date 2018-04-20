package iks.pttrns.factory;

import iks.pttrns.factory.ingridients.PizzaIngridientFactory;

public class ClamPizza extends Pizza {

    PizzaIngridientFactory ingridientFactory;

    public ClamPizza(PizzaIngridientFactory ingridientFactory) {
        name = "Clam pizza";
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clam = ingridientFactory.createClams();

    }
}
