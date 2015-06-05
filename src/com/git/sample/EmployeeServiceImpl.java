package com.git.sample;

import com.git.domain.Employee;

/**
 * Created by amm0924 on 6/5/2015.
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String getEmployeeName() {

        Employee employee = new Employee(123L, "Anurag");
        return employee.getName();
    }
}
