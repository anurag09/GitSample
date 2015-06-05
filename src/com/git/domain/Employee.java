package com.git.domain;

/**
 * Created by amm0924 on 6/5/2015.
 */
public class Employee {

    private Long id;
    private String name;
    private Double salary;

    public Employee(Long id) {
        this.id = id;
    }

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
