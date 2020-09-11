package Menu;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Food, Integer> foods = new HashMap<>();
    private Map<Beverage, Integer> beverages = new HashMap<>();

    public double getTotalBeverage(){
        double totalBeverage = 0;
        int quantityBeverage = 0;
        for (Beverage beverage : this.beverages.keySet()){
            totalBeverage = beverage.getBeveragePrice()*quantityBeverage;
        }
        return totalBeverage;
    }

   public void addBeverage(Beverage beverage, Integer quantity){
        this.beverages.put(beverage, quantity);
    }

    public double getTotalFood(){
        double totalFood = 0;
        int quantityFood = 0;
        for (Food food : this.foods.keySet()){
            totalFood = food.getFoodItemPrice()*quantityFood;
        }
        return totalFood;
    }

    public void addFood(Food food, Integer quantity){
        this.foods.put(food, quantity);
    }


}
