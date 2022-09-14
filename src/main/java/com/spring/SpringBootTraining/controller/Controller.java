package com.spring.SpringBootTraining.controller;

import com.spring.SpringBootTraining.dto.Dto;
import com.spring.SpringBootTraining.dto.EmployeeDto;
import com.spring.SpringBootTraining.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EmpService service;

    @PostMapping("/addEmployee")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto dto){
        EmployeeDto employeeDto=service.addEmployee(dto);
        return employeeDto;
    }


    @GetMapping("/findByemployeeName/{employeeName}")
    public List<EmployeeDto>findByemployeeName(@PathVariable String employeeName){
        List<EmployeeDto> employeeDto=service.findByemployeeName(employeeName);
        return  employeeDto;
    }

    @GetMapping("/findAllEmployee")
    public List<EmployeeDto> finAllEmployee(){
        return service.findAllEmployee();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
        return "Employee with Id "+id+" Deleted Successfully";
    }

    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody Dto dto){
        String dto1=service.updateEmployee(id,dto);


    return dto1;
    }


}
