package org.icet.final_task.service.impl;

import org.icet.final_task.dto.Employee;
import org.icet.final_task.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public Employee getById(Integer id) {
        return null;
    }

    @Override
    public Employee getByEmail(String email) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return List.of();
    }

    @Override
    public List<Employee> getByName(String name) {
        return List.of();
    }
}
