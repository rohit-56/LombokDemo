package com.example4.LearnLombok.Controller;

import com.example4.LearnLombok.Models.Employee;
import com.example4.LearnLombok.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmploye(@PathVariable("id") int id){
        Optional<Employee> optional=employeeServices.getEmployee(id);
        if(!optional.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        System.out.println((Employee)optional.get());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(optional.get());
    }

    @PostMapping("/employee")
    public ResponseEntity addEmploye(@RequestBody Employee employee){
      employeeServices.addEmployee(employee);
      return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
