package com.example4.LearnLombok.Repository;

import com.example4.LearnLombok.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
