package org.icet.final_task.controller;

import lombok.RequiredArgsConstructor;
import org.icet.final_task.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("api/v1/employees")
public class EmployeeController {
    final EmployeeService service;

}
