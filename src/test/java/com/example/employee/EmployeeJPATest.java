package com.example.employee;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class EmployeeJPATest {

    private static final String MALE = "male";

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void should_return_all_male_employee() {
        List<Employee> employees = null;
        //使用employeeRepository使测试通过，不能新建变量，需要在EmployeeRepository中新建方法

        assertEquals(3, employees.size());
    }

    @Test
    public void should_return_adult_employee_number() {
        long adultNumber = 2L;
        //使用employeeRepository使测试通过，不能新建变量，需要在EmployeeRepository中新建方法

        assertEquals(3L, adultNumber);
    }

    @Test
    public void should_return_highest_salary_employee_name() {
        String highestSalaryName = "no one";
        //使用employeeRepository使测试通过，不能新建变量，需要在EmployeeRepository中新建方法

        assertEquals("xiaozhi", highestSalaryName);
    }
}
