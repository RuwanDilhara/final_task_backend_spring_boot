package org.icet.final_task.service;

import org.icet.final_task.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(Integer id);
    Employee getByEmail(String email);
    Employee create(Employee employee) throws RuntimeException;
    Employee update(Employee employee);
    boolean deleteById(Integer id);
    List<Employee> getByDepartment(String department);
    List<Employee> getByName(String name);
}
