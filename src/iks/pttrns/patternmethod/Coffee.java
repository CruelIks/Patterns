package iks.pttrns.patternmethod;

public class Coffee extends Beverage {
/*    public void prepare() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();

    }

    private void addSugarAndMilk() {
    }

    private void pourInCup() {
    }

    private void brewCoffeeGrinds() {
    }

    private void boilWater() {
    }*/

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Brew coffe grinds");
    }
}
