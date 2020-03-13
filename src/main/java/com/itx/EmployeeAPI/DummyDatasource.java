package com.itx.EmployeeAPI;

import java.util.LinkedList;
import java.util.List;

// an in memory Datasource to allow for simple demonstration/testing
public class DummyDatasource implements Datasource{

    //TODO consider a map instead for fast simple lookups
    private List<Employee> employees = new LinkedList<Employee>();

    //TODO consider a map instead for fast simple lookups
    private List<Department> departments = new LinkedList<Department>();

    DummyDatasource() {

        // add some sample departments
        Department education = new SimpleDepartment();
        Department puns = new SimpleDepartment();
        Department accounting = new SimpleDepartment();
        departments.addAll([ education, puns, accounting ]);

        // add some sample employees
        Employee john = new SimpleEmployee();
        Employee jacob = new SimpleEmployee();
        Employee jinglehiemer = new SimpleEmployee();
        Employee schmidt = new SimpleEmployee();
        employees.addAll([ john, jacob, jinglehiemer, schmidt ]);
    }

    @Override
    public List<Employee> getEmployees() {
        return new LinkedList<>(this.employees);
    }

    @Override
    public List<Employee> getEmployees(String name) {
        return null;
    }

    @Override
    public List<Department> getDepartments() {
        return null;
    }
}
