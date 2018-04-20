package iks.pttrns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 1.60;
    }
}
