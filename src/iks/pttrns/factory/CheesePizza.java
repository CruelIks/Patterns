package iks.pttrns.factory;

import iks.pttrns.factory.ingridients.PizzaIngridientFactory;

public class CheesePizza extends Pizza {

    PizzaIngridientFactory ingridientFactory;

    public CheesePizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
    }
}
