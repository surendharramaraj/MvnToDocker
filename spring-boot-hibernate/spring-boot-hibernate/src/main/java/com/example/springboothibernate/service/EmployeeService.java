package com.example.springboothibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboothibernate.entity.Employee;
import com.example.springboothibernate.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public java.util.List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    public Employee updateEmployee(Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(employee.getId()).get();
        employeeToUpdate.setName(employee.getName());
        employeeToUpdate.setAge(employee.getAge());
        return employeeRepository.save(employeeToUpdate);
    }

    public String deleteEmployee(int d){
        employeeRepository.deleteById(d);
        return "Employee deleted successfully"+d;
    }
}
