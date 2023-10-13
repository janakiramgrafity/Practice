package com.spring.Mservices.service;

import com.spring.Mservices.entity.Emp;
import com.spring.Mservices.repository.EmployeeRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

   @Autowired
private EmployeeRepository empRepo;
public Emp getEmp(int empId){
return empRepo.findById(empId);
}
}
