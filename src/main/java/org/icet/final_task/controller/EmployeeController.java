package org.icet.final_task.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.icet.final_task.dto.Employee;
import org.icet.final_task.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("api/v1/employees")
public class EmployeeController {
    final EmployeeService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Employee> getById( @Valid @RequestParam ( name = "id" ,required = true ) Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<Employee> getByEmail(@Valid @RequestParam ( name = "email" ,required = true )String email){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByEmail(email));
    }

    @GetMapping("getByDepartment")
    public ResponseEntity<List<Employee>> getByDepartment(@Valid @RequestParam ( name = "department" ,required = true ) String department){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByDepartment(department));
    }

    @GetMapping("/getByName")
    public ResponseEntity<List<Employee>> getByName(@Valid @RequestParam ( name = "name" ,required = true )String name){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByName(name));
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(employee));
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> update(@Valid @RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(employee));
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(@Valid @RequestParam ( name = "id" ,required = true )Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteById(id));
    }

}
