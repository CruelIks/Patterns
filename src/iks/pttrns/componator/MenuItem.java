package iks.pttrns.componator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegeterian;
    double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegeterian() {
        return vegeterian;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegeterian=" + vegeterian +
                ", price=" + price +
                '}';
    }
}
