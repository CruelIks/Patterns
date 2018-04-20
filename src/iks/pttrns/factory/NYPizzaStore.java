package iks.pttrns.factory;

import iks.pttrns.factory.ingridients.NYIngridientFactory;
import iks.pttrns.factory.ingridients.PizzaIngridientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngridientFactory ingridientFactory = new NYIngridientFactory();
        switch (type) {
            case "cheese": {
                Pizza pizza = new CheesePizza(ingridientFactory);
                pizza.setName("NY Cheese Pizza");
                return pizza;
            }
            default: {
                throw new RuntimeException("Unknown type of pizza!" + type);
            }
        }
    }
}
