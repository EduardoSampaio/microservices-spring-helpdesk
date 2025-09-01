package br.com.dev.userserviceapi.service;

import br.com.dev.userserviceapi.mapper.UserMapper;
import br.com.dev.userserviceapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import models.exceptions.ResourceNotFoundException;
import models.requests.CreateUserRequest;
import models.responses.UserResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    private final BCryptPasswordEncoder encoder;

    public UserResponse findById(final String id) {
        return mapper.fromEntity(repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found")));
    }

    public void save(CreateUserRequest request) {
        //verifyIfEmailAlreadyExists(request.email(), null);
        repository.save(mapper.fromRequest(request));
    }

//    private void verifyIfEmailAlreadyExists(final String email, final String id) {
//        repository.findByEmail(email)
//                .filter(user -> !user.getId().equals(id))
//                .ifPresent(user -> {
//                    throw new DataIntegrityViolationException("Email [ " + email + " ] already exists");
//                });
//    }
}
