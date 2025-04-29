package org.icet.final_task.service.impl;

import lombok.RequiredArgsConstructor;
import org.icet.final_task.exceptionHandling.EmailAlreadyExistsException;
import org.icet.final_task.exceptionHandling.IdAlreadyNotExitsException;
import org.icet.final_task.dto.Employee;
import org.icet.final_task.entity.EmployeeEntity;
import org.icet.final_task.repository.EmployeeRepository;
import org.icet.final_task.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeImpl implements EmployeeService {

    final EmployeeRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Employee> getAll() {
        return repository.findAll().stream().map(entity ->
                mapper.map(entity, Employee.class)
        ).toList();
    }

    @Override
    public Employee getById(Integer id) {
        return repository.findById(id).map(entity ->
                mapper.map(entity, Employee.class)
        ).orElse(null);
    }

    @Override
    public Employee getByEmail(String email) {
       return mapper.map(repository.findByEmail(email), Employee.class);
    }

    @Override
    public Employee create(Employee employee){
        if (repository.findByEmail(employee.getEmail()) != null){
            throw new EmailAlreadyExistsException("Email already exists" +employee.getEmail());
        }
        return mapper.map(repository.save(mapper
                .map(employee, EmployeeEntity.class)), Employee.class);

    }

    @Override
    public Employee update(Employee employee) {
        Employee byId = getById(employee.getId());
        if (byId == null){
            throw new IdAlreadyNotExitsException("Id already not exist" +employee.getId());
        }
        return mapper.map(repository.save(mapper
                .map(employee, EmployeeEntity.class)),Employee.class);
    }

    @Override
    public boolean deleteById(Integer id) {
        Employee exitsById = getById(id);

        if (exitsById != null){
            repository.deleteById(id);
            return true;
        }else {
            throw new IdAlreadyNotExitsException("Id already not exist" +id);
        }
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return repository.findByDepartment(department).stream().map(entity ->
                mapper.map(entity, Employee.class)
        ).toList();
    }

    @Override
    public List<Employee> getByName(String name) {
        return repository.findByName(name).stream().map(entity ->
                mapper.map(entity, Employee.class)
        ).toList();
    }
}
