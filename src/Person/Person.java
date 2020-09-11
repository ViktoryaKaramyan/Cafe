package Person;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    enum Gender {
        MALE, FEMALE
    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
}
