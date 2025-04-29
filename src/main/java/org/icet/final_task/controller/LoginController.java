package org.icet.final_task.controller;

import lombok.RequiredArgsConstructor;
import org.icet.final_task.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class LoginController {
    final LoginService service;

}
