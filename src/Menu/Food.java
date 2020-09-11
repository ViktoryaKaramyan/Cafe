package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {

    private int foodItemID;
    private String foodName;
    private double foodItemPrice;

    public Food(){

    }

    public Food(int foodItemID, String foodName, double foodItemPrice) {
        this.foodItemID = foodItemID;
        this.foodName = foodName;
        this.foodItemPrice = foodItemPrice;
    }

    public int getFoodItemID() {
        return foodItemID;
    }

    public void setFoodItemID(int foodItemID) {
        this.foodItemID = foodItemID;
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
