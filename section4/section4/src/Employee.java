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

    public Employee(String firstName, String lastName, byte age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
        this.gender=gender;
    }

    public byte getAge() {
        return age;
    }

    public char getGender(){
        return gender;
    }
}
