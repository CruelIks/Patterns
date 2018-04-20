package iks.pttrns.collections;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Vegie burger", "Burger with onion", true, 4.90);
        addItem("Vegie stake", "Stake with cucumber", true, 3.90);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.put(menuItem.getName(), menuItem);

    }

    public Hashtable getMenuItems() {
        return menuItems;
    }
}
