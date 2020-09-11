import Area.CafeLocation;
import Area.ServingTable;
import Menu.MainMenu;
import Menu.Order;
import Person.Customer;
import Person.Person;

import java.util.Scanner;

public class CafeApp implements CafeLocation {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println(CafeLocation.displayCafeName("WELCOME TO 'My Firenze' CAFE"));
                System.out.println("Cafe opens hours from " + CafeLocation.cafeIsOpen() + " to " + CafeLocation.cafeIsClose());
                Customer customer = new Customer();
                MainMenu mainMenu = new MainMenu();
                ServingTable servingTable = new ServingTable();


                if(!servingTable.isTableOccupied()){
                        servingTable.isRealiseTable();
                        mainMenu.isDisplay();
                        //customer.giveOrder();
                }


        }



}
