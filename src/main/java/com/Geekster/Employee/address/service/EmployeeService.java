package com.Geekster.Employee.address.service;

import com.Geekster.Employee.address.model.Employee;
import com.Geekster.Employee.address.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public String CreateEmployees(Employee employees) {
        iEmployeeRepo.save(employees);
        return "Add Emp";
    }

    public List<Employee> getAllEmployees() {
       return iEmployeeRepo.findAll();
    }

    public Employee getEmployeeIdBy(Employee id) {
        return iEmployeeRepo.findById(id);
    }

    public void updateEmp(long id, Employee employee) {
     boolean emp1 = iEmployeeRepo.existsById(id);
     if(emp1){
         iEmployeeRepo.save(employee);
     }
    }

    public String deleteEmp(Long id) {
        iEmployeeRepo.deleteById(id);
        return "delete Employee";
    }
}
