package java8.lambda;

/**
 * Created by premsingh on 10/2/18.
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    /**
     * Sets new age.
     * @param age New value of age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets age.
     * @return Value of age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets new lastName.
     * @param lastName New value of lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets new id.
     * @param id New value of id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets lastName.
     * @return Value of lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets id.
     * @return Value of id.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets new firstName.
     * @param firstName New value of firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets firstName.
     * @return Value of firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
