package org.icet.final_task.service;

import org.icet.final_task.dto.Login;

public interface LoginService {
    boolean verify(Login login);
}
