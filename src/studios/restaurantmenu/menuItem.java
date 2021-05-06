package studios.restaurantmenu;
import java.util.*;

public class menuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private Date date;

    public menuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        Date date = new Date();
        //String date = String.format("%tD",newDate);
        this.date = date;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate() {
        Date date = new Date();
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public void lastUpdated() {
        Date rightNow = new Date();
        Date history = this.date;
        if (history.compareTo(rightNow) > 0) {
            System.out.println(history + " is after " + rightNow);
        } else if (history.compareTo(rightNow) < 0) {
            System.out.println(history + " is before " + rightNow );
        } else {
            System.out.println(rightNow + " is equal to " + history);
        }

    }


    //public String getInfo() {
    //    return System.out.println(this.name,this.category,this.description,this.price, this.date);
    //}

}
