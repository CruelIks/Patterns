package iks.pttrns.patternmethod;

public class Tea extends Beverage {

/*    public void prepare() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
    }

    private void pourInCup() {
    }

    private void steepTeaBag() {
    }

    private void boilWater() {
    }*/

    @Override
    void addCondiments() {
        System.out.println("Add lemon");
    }

    @Override
    void brew() {
        System.out.println("Adding tea bag...");
    }
}
