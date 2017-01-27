package employee; /**
 * Created by Myroslava_Zubach on 27.01.2017.
 */
import java.io.*;
public class Employee {
    public String name;
    public int age;
    public String designation;
    public double salary;

    // This is the constructor of the class employee.Employee
    public Employee(String name) {
        this.name = name;
    }

    // Assign the age of the employee.Employee  to the variable age.
    public void setEmpAge(int empAge) {
        age = empAge;
    }

    public int getEmpAge() {
        return age;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the employee.Employee details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}
