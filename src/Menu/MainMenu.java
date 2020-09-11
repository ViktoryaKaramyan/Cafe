package Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainMenu {
    private List<Food> foodMenu;
    private List<Drinks> drinksMenu;

    public MainMenu(){
        foodMenu = new ArrayList<>();
        drinksMenu = new ArrayList<>();
        foodMenu.add(new Food(1, "Soup", 1000));
        foodMenu.add(new Food(2, "Fries", 500));
        foodMenu.add(new Food(3,"Burger", 1500));
        drinksMenu.add(new Drinks(1, "Coca-Cola 0.5l", 250));
        drinksMenu.add(new Drinks(2, "Sparkling water 0.5l", 245));
        drinksMenu.add(new Drinks(3, "Coffee", 550));

    }

    public void isDisplay() {
        int i = 0;
        for (Food foodItem : foodMenu) {
            System.out.println(i + ":  " + foodItem.getFoodItemID() + "  " + foodItem.getFoodName() + "  "
                    + foodItem.getFoodItemPrice());
            i++;
        }

        int j = 0;
        for (Drinks drinkItem : drinksMenu) {
            System.out.println(i + ":  " + drinkItem.getDrinkID() + "  " + drinkItem.getDrinkName() + "  "
                    + drinkItem.getDrinkPrice());
            j++;
        }

    }
}
