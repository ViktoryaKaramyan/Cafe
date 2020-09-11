package Person;

import java.util.ArrayList;


public class Roles {
    private int roleID;
    private String positionName;

    public Roles(int roleID, String positionName) {
        this.roleID = roleID;
        this.positionName = positionName;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public static void main(String[] args) {
        ArrayList<String> roles = new ArrayList<>();
        roles.add(1, "Director");
        roles.add(2, "Manager 1");
        roles.add(3, "Manager 2");
        roles.add(4, "Barmen");
        roles.add(5, "Waiter 1");
        roles.add(6, "Waiter 2");
        roles.add(7, "Cashier 1");
        roles.add(8, "Cashier 2");





    }
}
