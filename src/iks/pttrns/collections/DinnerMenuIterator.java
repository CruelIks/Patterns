package iks.pttrns.collections;
import java.util.Iterator;

public class DinnerMenuIterator implements java.util.Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new UnsupportedOperationException("Can't do that!");
        }
        menuItems[position] = null;
        position--;

    }
}
