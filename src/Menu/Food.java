package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {

    private int foodID;
    private String foodName;
    private double foodItemPrice;

    public Food(int foodID, String foodName, double foodItemPrice) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodItemPrice = foodItemPrice;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodItemPrice() {
        return foodItemPrice;
    }

    public void setFoodItemPrice(double foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }
}
