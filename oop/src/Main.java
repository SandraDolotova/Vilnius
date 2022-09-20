


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee1 = new Employee("newName", 670, 2022, 01, 24);

        System.out.println(employee1);
        System.out.println(employee1.getName());

        Employee[] staff = new Employee[3];
        staff[0] = employee1;
        staff[1] = new Employee("max", 990, 2020, 05, 20);
        staff[2] = new Employee("ben", 1500, 2019, 03, 25);

        for(Employee employee : staff){
            employee.raiseSalary(5);
            System.out.println(employee);
        }
        
    }

}