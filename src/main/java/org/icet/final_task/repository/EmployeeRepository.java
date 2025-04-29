package org.icet.final_task.repository;

import org.icet.final_task.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity ,Integer> {
}
