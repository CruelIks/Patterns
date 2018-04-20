package iks.pttrns.collections;

public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Sandwich", "Simple sandwich", false, 1.99);
        addItem("Beverage", "Water", true, 0.99);
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);

        if (numberOfItems >= MAX_ITEMS) {
            throw new RuntimeException("Out of menu range!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }

    }

/*    public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    @Override
    public java.util.Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
