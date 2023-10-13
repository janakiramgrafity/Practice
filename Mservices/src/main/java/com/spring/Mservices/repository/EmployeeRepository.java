package com.spring.Mservices.repository;

import com.spring.Mservices.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Emp,Integer> {
Emp findById(int empId);

}
