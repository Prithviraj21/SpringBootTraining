package com.spring.SpringBootTraining.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Employee")
public class EmployeeDto implements Serializable {
    @Id
    @Column(name = "EMPID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(name = "EMPNAME")
    private String employeeName;

    @Column(name = "SALARY")
    private Integer salary;
}
