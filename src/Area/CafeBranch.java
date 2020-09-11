package Area;

import Menu.Drinks;
import Menu.Food;
import Menu.MainMenu;
import Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CafeBranch {

   private int quantityOfTable = 10;
   private List<ServingTable> servingTables;
   private MainMenu mainMenu;
   private Customer currentCustomer;
   private List<Customer> customers;

   private CafeBranch(){
       servingTables = new ArrayList<>();
       mainMenu = new MainMenu();
       customers = new ArrayList<>();
       currentCustomer = null;
       for (int i = 0; i < quantityOfTable; i++){
           ServingTable servingTable = new ServingTable();
           servingTables.add(servingTable);
       }
   }

   public List<ServingTable> getServingTables(){
       return servingTables;
   }

   public boolean isAnyTablesOccupied(){
       for (int i = 0; i < quantityOfTable; i++){
           if(servingTables.get(i).isTableOccupied()){
               return true;
           }
       }
       return false;
   }

   public int isEmptyTable(){
       for (int i = 0; i < quantityOfTable; i++){
           if(!servingTables.get(i).isTableOccupied()){
               return i;
           }
       }
       return -1;
   }

   public void quantityOfOccupiedTAbles(){
       for (int i = 0; i < quantityOfTable; i++){
           if(servingTables.get(i).isTableOccupied()){
               System.out.println(i + "tables is occupied");
           }
       }
   }

   public boolean allTablesIsOccupied(){
       int count = isEmptyTable();
       return count == -1;
   }

   public MainMenu getMainMenu(){
       return mainMenu;
   }

   public void setMainMenu(MainMenu mainMenu){
       this.mainMenu = mainMenu;
   }

   /*public void addNewCustomer(Customer customer){
       customer.giveOrder(getMainMenu().);

   }*/
}
