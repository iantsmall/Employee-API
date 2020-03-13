package com.itx.EmployeeAPI;

public class SimpleEmployee implements Employee {
    private String name;
    private Integer salary;
    private Department department;
    SimpleDepartment(String name, Integer salary, Department department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
