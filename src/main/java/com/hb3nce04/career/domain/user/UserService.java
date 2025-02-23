package com.hb3nce04.career.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    @Override
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByUsername(username);
        if (user.isPresent()) {
            return mapper.toDTO(user.get());
        }
        throw new UsernameNotFoundException(username);
    }

    public User create(User user) {
        if (repository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("Felhasználó az adott névvel már létezik!");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
        return user;
    }
}
