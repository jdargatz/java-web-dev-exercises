package studios.restaurantmenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class restaurant {


    public static void main(String[] args) {
        menuItem shrimp = new menuItem("Shrimp Cocktail", "Six elegantly arranged shrimp with a cocktail " +
                "dipping sauce.",
                "Appetizers", 6.99);
        menuItem fish = new menuItem("White Fish", "Broiled white fish with light seasoning served with " +
                "seasonal vegetables and a rice pilaf.",
                "Entrees", 11.99);
        menuItem beef = new menuItem("6oz Ribeye", "Grilled to your perfection with a seasoned rosemary " +
                "butter, served with sauteed onions, mashed potatoes with a light gravy, and greens.",
                "Entrees", 19.99);
        menuItem tendies = new menuItem("Chicken Tenders", "Four crispy chicken tenders for those precious, " +
                "picky kiddos given punch of umami with Heinz ketchup and fries.",
                "Entrees", 9.99);
        menuItem cake = new menuItem("Chocolate Cake", "Decadent chocolate cake with a layer of dark " +
                "chocolate mousse and a top layer of chocolate gaunche.",
                "Desserts", 5.99);
        Date today = Calendar.getInstance().getTime();
        ArrayList<menuItem> startingMenu = new ArrayList<>();
        menu ourMenu = new menu(today, startingMenu);
        ourMenu.addItem(shrimp);
        ourMenu.addItem(fish);
        ourMenu.addItem(beef);
        ourMenu.addItem(tendies);
        ourMenu.addItem(cake);

        System.out.println(shrimp.getDate());
        System.out.println(shrimp.getName());
        System.out.println(beef.getName());
        System.out.println(beef.getDate());
        System.out.println(tendies.getName());
        System.out.println(fish.getName());
        System.out.println(cake.getName());

        shrimp.lastUpdated();
        ourMenu.printMenu();
    }
}
