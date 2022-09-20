
import java.time.*; // * -> means all or every


public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDate = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    @Override
    public String toString (){
        return "Employee " + getName() + " earning " + getSalary() + " has been hired at " + getHireDate();
    }

    public void raiseSalary (double byPercent){
        double amount = salary * byPercent / 100;
       salary += amount; // salary = salary + amount;
    }




}
