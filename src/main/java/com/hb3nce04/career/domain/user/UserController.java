package com.hb3nce04.career.domain.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("register")
    public ResponseEntity<UserDto> register(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(userMapper.toDTO(userService.create(userMapper.toEntity(userDto))), HttpStatus.CREATED);
    }
}
