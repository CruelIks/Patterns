package iks.pttrns.command;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean equals(Person o) {
        return o.name.equals(this.name);
    }

}
