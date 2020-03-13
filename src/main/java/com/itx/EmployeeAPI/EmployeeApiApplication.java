package com.itx.EmployeeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO implement API
// TODO create Employee model
// TODO create Department model
// TODO create GET employee endpoint (returns list of employees, pagination a nice extra)
// TODO implement search by name
// TODO create POST employee endpoint (data validation: unique, names with only letters, salary positive(integer as USD cents) )
// TODO create department endpoint
/*
Employee API

REST api, spring boot, no need for a persitency, you could/should just return dummy objects and return those.

Model:

Employee
 name
 salary
 department

 Department
  name

Rest API should implement the following operations:

- Add new employee
- Get list of employees (Optional: pagination)
- Validations: unique, names with only letters, salary positive
- Search by salary and/or name

 */
@SpringBootApplication
public class EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
