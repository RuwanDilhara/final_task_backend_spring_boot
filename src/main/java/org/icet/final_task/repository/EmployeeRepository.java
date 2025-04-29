package org.icet.final_task.repository;

import org.icet.final_task.dto.Employee;
import org.icet.final_task.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity ,Integer> {
    EmployeeEntity findByEmail(String email);

    List<EmployeeEntity> findByDepartment(String department);

    List<EmployeeEntity>findByName(String name);
}
