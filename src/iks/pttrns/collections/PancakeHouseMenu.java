package iks.pttrns.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("Breakfast", "Something to eat", false, 5.99);
        addItem("Lunch", "Something to lunch", true, 2.99);
        addItem("Dinner", "Something to dinner", false, 6.99);

    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.add(menuItem);
    }

/*    public ArrayList getMenuItems() {
        return menuItems;
    }*/

/*    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }*/

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
