package com.hb3nce04.career.domain.user;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends CrudControllerImpl<UserDto, User, UserMapper, Integer> {
    public UserController(CrudService<User, Integer> service, UserMapper mapper) {
        super(service, mapper);
    }
}
