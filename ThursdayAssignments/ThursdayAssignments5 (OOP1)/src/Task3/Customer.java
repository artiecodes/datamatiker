package Task3;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer (String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ". Last name: " + lastName + ". Username: " + userName + ".";
    }
}
