package br.com.dev.userserviceapi.controller.impl;

import br.com.dev.userserviceapi.controller.UserController;
import br.com.dev.userserviceapi.entity.User;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {
    @Override
    public ResponseEntity<UserResponse> findById(String id) {
        return null;
    }
}
