package com.keetica.persistence;

import com.keetica.models.Employee;

import java.util.List;

public interface IEmployeeDao {

    public Employee getEmployeeById(int id);
    public List<Employee> getAllEmployees();
}
