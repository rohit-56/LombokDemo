package com.example4.LearnLombok.Services;

import com.example4.LearnLombok.Models.Employee;
import com.example4.LearnLombok.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
     employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployee(int id){
       return  employeeRepository.findById(id);
    }
}
