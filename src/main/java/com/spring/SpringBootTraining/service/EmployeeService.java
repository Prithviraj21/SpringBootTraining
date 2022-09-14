package com.spring.SpringBootTraining.service;

import com.spring.SpringBootTraining.dto.Dto;
import com.spring.SpringBootTraining.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto dto);
   List<EmployeeDto> findByemployeeName(String employeeName);

    List<EmployeeDto> findAllEmployee();
    void deleteEmployee(Integer id);

    String updateEmployee(int id, Dto dto);
}
