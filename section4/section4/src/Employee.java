public class Employee {

    //The data that we want to store with the help of this Java fields is what is the firstName, lastName,
    //age, gender of the employee.

    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee(){
        System.out.println("Object is getting created in default constructor");
        this("Max", "Ton", (byte)12, 'M');
    }

    public Employee(String firstName, String lastName, byte age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
        this.gender=gender;
        System.out.println("Object is getting created in overloaded  constructor");
    }

    public byte getAge() {
        return age;
    }

    public char getGender(){
        return gender;
    }
}
