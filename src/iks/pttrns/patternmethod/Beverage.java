package iks.pttrns.patternmethod;

public abstract class Beverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in a cup");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

}
