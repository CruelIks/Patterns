package iks.pttrns.patternmethod;

public class Application {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepare();

        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}
