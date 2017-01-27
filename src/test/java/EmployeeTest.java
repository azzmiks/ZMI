import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Myroslava_Zubach on 27.01.2017.
 */

public class EmployeeTest {

    @Test
    public void employeeTest() {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.setEmpAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.setEmpAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        assertThat(empOne.age).isEqualTo(empTwo.getEmpAge());
    }

}
