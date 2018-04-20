package iks.pttrns.collections;

public class Application {
    public static void main(String[] args) {
        new Waitress(new PancakeHouseMenu(), new DinnerMenu()).printMenu();
    }
}
