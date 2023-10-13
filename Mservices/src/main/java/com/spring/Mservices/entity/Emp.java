package com.spring.Mservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Emp")
public class Emp {
@Id
@Column(name="Id")
    private int EmpId;
    private String name;

    public Emp(int empId, String name) {
        EmpId = empId;
        this.name = name;
    }

    public Emp() {
    }

    public int getEmpId() {
        return EmpId;

    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                '}';
    }
}
