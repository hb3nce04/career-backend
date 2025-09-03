package io.hb3nce04.career.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.BaseController;
import io.hb3nce04.career.backend.mapper.UserMapper;
import io.hb3nce04.career.backend.model.dto.UserDto;
import io.hb3nce04.career.backend.model.dto.request.CreateUserRequestDto;
import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.UserRepository;
import io.hb3nce04.career.backend.service.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController<UserService, UserDto, User, UserMapper, UserRepository> {

    public UserController(UserService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody @Valid CreateUserRequestDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }
}
