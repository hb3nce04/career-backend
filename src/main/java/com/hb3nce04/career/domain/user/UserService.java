package com.hb3nce04.career.domain.user;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudServiceImpl<User, Integer> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
