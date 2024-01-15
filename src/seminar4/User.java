package seminar4;

public class User {
    private String firstName;
    private String lastName;
    private String secondName;

    public User(String firstName, String lastName, String secondName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
