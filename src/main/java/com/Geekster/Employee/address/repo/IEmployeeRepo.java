package com.Geekster.Employee.address.repo;

import com.Geekster.Employee.address.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findById(Employee id);
}
