package Person;

public class Shift {

    public static int morningShift = 1;
    public static int eveningShift = 2;
    Employee employee;

    public Shift(Employee employee) {
        this.employee = employee;
    }

    public static int getMorningShift() {
        return morningShift;
    }

    public static void setMorningShift(int morningShift) {
        Shift.morningShift = morningShift;
    }

    public static int getEveningShift() {
        return eveningShift;
    }

    public static void setEveningShift(int eveningShift) {
        Shift.eveningShift = eveningShift;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
