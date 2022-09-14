package com.spring.SpringBootTraining.service;

import com.spring.SpringBootTraining.dao.EmployeeDao;
import com.spring.SpringBootTraining.dto.Dto;
import com.spring.SpringBootTraining.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService implements EmployeeService{
    @Autowired
    private EmployeeDao dao;
    @Override
    public EmployeeDto addEmployee(EmployeeDto dto) {
        return dao.save(dto);
    }

    @Override
    public List<EmployeeDto> findByemployeeName(String employeeName) {
        return dao.findByemployeeName(employeeName);
    }

    @Override
    public List<EmployeeDto> findAllEmployee() {
        return (List<EmployeeDto>) dao.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public String updateEmployee(int id, Dto dto) {
        Optional<EmployeeDto> dto1=dao.findById(id);
        if(dto1.isPresent()){
            EmployeeDto dto2=dto1.get();
            dto2.setEmployeeName(dto.getEmployeeName());
            dto2.setSalary(dto.getSalary());
        return "Employee with id "+id+" updated successfully"+dao.save(dto2);}
        else return "Employee with id "+id+" not found";
    }
}
