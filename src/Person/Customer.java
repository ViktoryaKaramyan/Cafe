package Person;

import Menu.Drinks;
import Menu.Food;
import Menu.Order;

public class Customer {

    private int customerID;
    private Order order;

    public Customer(){
        customerID = 0;
        order = new Order(customerID);
    }

    public Customer(int customerID){
        order = new Order(customerID);
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void giveOrder(Food food, Drinks drinks){
        Order newOrder = new Order(food, drinks);
        order.addOrder(food, drinks);
    }


}
