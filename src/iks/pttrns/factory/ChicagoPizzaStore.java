package iks.pttrns.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            throw new RuntimeException("Unknown type of pizza!" + type);
        }
    }
}
