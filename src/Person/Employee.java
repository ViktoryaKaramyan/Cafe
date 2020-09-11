package Person;

import javax.management.relation.Role;

public class Employee extends Person{

    private int employeeID;
    private double salary;


    public Employee(int employeeID, String firstName, String lastName, int age, Gender gender, Roles roles, double salary) {
        super(firstName, lastName, age, gender);
        this.employeeID = employeeID;
        this.salary = salary;

    }



}
