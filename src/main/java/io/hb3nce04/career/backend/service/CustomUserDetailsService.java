package io.hb3nce04.career.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String educationId) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEducationId(educationId);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Felhasználó: " + educationId + " oktatási azonosítóval nem található");
        }
        String password = user.get().getPassword();
        Boolean isAdmin = user.get().getIsAdmin();
        return new org.springframework.security.core.userdetails.User(educationId, password,
                List.of(new SimpleGrantedAuthority(isAdmin ? "ROLE_ADMIN" : "ROLE_USER")));
    }
}
