package io.hb3nce04.career.backend.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.UserMapper;
import io.hb3nce04.career.backend.model.dto.UserDto;
import io.hb3nce04.career.backend.model.dto.request.CreateUserRequestDto;
import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.UserRepository;
import io.hb3nce04.career.backend.service.common.BaseService;

@Service
public class UserService extends BaseService<UserDto, User, UserMapper, UserRepository> {
    private final PasswordEncoder encoder;

    public UserService(
            UserMapper mapper,
            UserRepository repository,
            PasswordEncoder encoder) {
        super(mapper, repository);
        this.encoder = encoder;
    }

    public UserDto create(CreateUserRequestDto dto) {
        User user = new User();
        user.setEducationId(dto.getEducationId());
        user.setPassword(this.encoder.encode(dto.getPassword()));
        user.setIsAdmin(dto.getIsAdmin());
        this.repository.save(user);
        return mapper.toDto(user);
    }
}
