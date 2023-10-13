package com.spring.Mservices.Controller;

import com.spring.Mservices.entity.Emp;
import com.spring.Mservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp")
public class EmpController {
@Autowired
    private EmployeeService empService;
@GetMapping("/{empId}")
public Emp getEmployee(@PathVariable("empId")Integer empId){

    return empService.getEmp(empId);
}
}
