package iks.pttrns.factory;

import iks.pttrns.factory.ingridients.Cheese;
import iks.pttrns.factory.ingridients.Clams;
import iks.pttrns.factory.ingridients.Dough;
import iks.pttrns.factory.ingridients.Pepperoni;
import iks.pttrns.factory.ingridients.Sauce;
import iks.pttrns.factory.ingridients.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    abstract void prepare();

    public String getName() {
        return name;
    }

    void bake() {
        System.out.println("Bake");
    }

    void cut() {
        System.out.println("Cut");
    }

    void box() {
        System.out.println("Box");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
