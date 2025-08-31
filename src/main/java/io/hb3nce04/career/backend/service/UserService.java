package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.UserDto;
import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.UserRepository;
import io.hb3nce04.career.backend.service.common.BaseService;

@Service
public class UserService extends BaseService<UserDto, User, UserRepository> {
    public UserService(
            UserRepository repository,
            BaseMapper<UserDto, User> mapper) {
        super(repository, mapper);
    }
}
