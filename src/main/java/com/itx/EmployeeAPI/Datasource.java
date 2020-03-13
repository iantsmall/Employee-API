package com.itx.EmployeeAPI;

import java.util.List;

public interface Datasource {
    public List<Employee> getEmployees();
    public List<Department> getDepartments();
}
