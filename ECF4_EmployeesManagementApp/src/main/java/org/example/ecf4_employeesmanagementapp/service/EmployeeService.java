package org.example.ecf4_employeesmanagementapp.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.ecf4_employeesmanagementapp.model.Department;
import org.example.ecf4_employeesmanagementapp.model.Employee;
import org.example.ecf4_employeesmanagementapp.model.Job;
import org.example.ecf4_employeesmanagementapp.repository.EmployeeRepository;

import java.util.List;

@ApplicationScoped
public class EmployeeService {

    EmployeeRepository employeeRepository = new EmployeeRepository();

    public Employee save(int id, String lastName, String firstName, double wage, Department department, Job job){
        Employee employee = new Employee(id, lastName, firstName, wage, department, job);
        return employeeRepository.add(employee);
    }

    public Employee findById(int id){
        return employeeRepository.findById(id);
    }

    public boolean delete(int id){
        Employee employee = employeeRepository.findById(id);
        return employeeRepository.delete(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAllEmployees();
    }
}
