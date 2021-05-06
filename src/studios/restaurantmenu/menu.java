package studios.restaurantmenu;

import java.awt.*;
import java.util.*;

public class menu {
    private Date lastUpdate;
    private ArrayList<menuItem> items;

    public menu(Date lastUpdate, ArrayList<menuItem> items) {
        this.lastUpdate = lastUpdate;
        this.items = items;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public ArrayList<menuItem> getItems() {
        return items;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setItems(ArrayList<menuItem> items) {
        this.items = items;
    }

    public ArrayList<menuItem> addItem(menuItem item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<menuItem> removeItem(menuItem item) {
        int toBeRemoved = -1;
        for (int i = 0; i <items.size(); i++) {
            if (items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved); //now removes at this index
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was last updated on "+ this.lastUpdate);
    }
    public void printMenu() {
        for (int i = 0; i <items.size(); i++) {
            System.out.println(items.get(i).getName());
            System.out.println(items.get(i).getDescription());
            System.out.println(items.get(i).getPrice());
        }
    }
    public void printItem(menuItem item) {
        System.out.println(item.getName());
        System.out.println(item.getDescription());
    }
}
