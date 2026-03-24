public class EmployeeMain {
    static void main(String[] args) {
        Employee employee1 = new Employee("Max", "Ton", (byte)12, 'M');
        Employee employee2 = new Employee("John", "Doe", (byte)16, 'M');
        Employee employee3 = new Employee();
        /*employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 16;
        employee.gender = 'M';*/

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());

        System.out.println(Employee.EMPLOYER_NAME);
    }
}
