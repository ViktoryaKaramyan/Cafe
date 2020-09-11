package Menu;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderID;
    private List<Food> foods = new ArrayList<>();
    private List<Drinks> drinks = new ArrayList<>();

    public Order(Food food, Drinks drinks) {
        orderID = 0;
    }

    public Order(int orderID) {
        this.orderID = orderID;
    }

    public Order(int food, int drinks) {
    }

    public Order(int food, Drinks drinks) {
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void addOrder(Food food, Drinks drink){
        foods.add(food);
        drinks.add(drink);
    }
}
