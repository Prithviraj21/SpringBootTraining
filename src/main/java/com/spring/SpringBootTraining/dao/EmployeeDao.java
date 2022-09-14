package com.spring.SpringBootTraining.dao;

import com.spring.SpringBootTraining.dto.EmployeeDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeDto,Integer>{
    public List<EmployeeDto> findByemployeeName(String employeeName) ;
    public EmployeeDto findByemployeeId(Integer id) ;

}
