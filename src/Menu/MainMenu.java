package Menu;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Food> foodMenu;
    private List<Beverage> beverageMenus;

    public MainMenu(){
        foodMenu = new ArrayList<>();
        beverageMenus = new ArrayList<>();
        foodMenu.add(new Food(1, "Soup", 1000));
        foodMenu.add(new Food(2, "Fries", 500));
        foodMenu.add(new Food(3,"Burger", 1500));
        beverageMenus.add(new Beverage(1, "Coca-Cola 0.5l", 250));
        beverageMenus.add(new Beverage(2, "Sparkling water 0.5l", 245));
        beverageMenus.add(new Beverage(3, "Coffee", 550));

    }


}
