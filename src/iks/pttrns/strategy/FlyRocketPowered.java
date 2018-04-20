package iks.pttrns.strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket power flight!");
    }
}
