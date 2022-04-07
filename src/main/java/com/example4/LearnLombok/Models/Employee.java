package com.example4.LearnLombok.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String EmpName;

    private String Designation;

    private String Email;


}
