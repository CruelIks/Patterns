package iks.pttrns.collections;

import java.util.ArrayList;

public class PancakeHouseIterator implements java.util.Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.size());
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
