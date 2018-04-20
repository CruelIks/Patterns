package iks.pttrns.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Pizza";
    }

    @Override
    void cut() {
        System.out.println("Cutting into square");
    }

    @Override
    void prepare() {

    }
}
