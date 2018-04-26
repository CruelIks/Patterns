package iks.pttrns.composite;

public class Application {
    public static void main(String[] args) {
        Goose goose = new Goose();
        System.out.println("default Boolean: " + goose.getBoo());
        System.out.println("Boo == True: " + goose.isBoo());
        System.out.println("default boolean: " + goose.isBo());
    }
}
