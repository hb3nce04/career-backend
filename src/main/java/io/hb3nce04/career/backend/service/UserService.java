package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.UserMapper;
import io.hb3nce04.career.backend.model.dto.UserDto;
import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.UserRepository;
import io.hb3nce04.career.backend.service.common.BaseService;

@Service
public class UserService extends BaseService<UserDto, User, UserMapper, UserRepository> {
    public UserService(
            UserMapper mapper,
            UserRepository repository) {
        super(mapper, repository);
    }
}
