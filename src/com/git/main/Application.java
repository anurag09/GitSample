package com.git.main;

import com.git.sample.EmployeeService;
import com.git.sample.EmployeeServiceImpl;

/**
 * Created by amm0924 on 6/5/2015.
 */
public class Application {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println(employeeService.getEmployeeName());
    }
}
