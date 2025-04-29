package org.icet.final_task.service.impl;

import lombok.RequiredArgsConstructor;
import org.icet.final_task.dto.Login;
import org.icet.final_task.service.LoginService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean verify(Login login) {
        return true;
    }
}
