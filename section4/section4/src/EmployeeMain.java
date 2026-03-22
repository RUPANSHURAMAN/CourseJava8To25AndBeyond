public class EmployeeMain {
    static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        /*employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 16;
        employee.gender = 'M';*/

        System.out.println(employee.getAge());
        System.out.println(employee.getGender());

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());
    }
}
