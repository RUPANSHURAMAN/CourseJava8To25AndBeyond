public class Employee {

    //The data that we want to store with the help of this Java fields is what is the firstName, lastName,
    //age, gender of the employee.

    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee(){
        this.firstName = "John";
        this.lastName = "Doe";
        this.age=16;
        this.gender='M';
        System.out.println("Object is getting created");
    }
    public byte getAge() {
        return age;
    }

    public char getGender(){
        return gender;
    }
}
