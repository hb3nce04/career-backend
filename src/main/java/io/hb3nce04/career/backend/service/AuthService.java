package io.hb3nce04.career.backend.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.dto.request.AuthRequestDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;
    private final TokenProviderService tokenProviderService;

    public String loginAndGetToken(AuthRequestDto requestDto) {
        try {
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(requestDto.getEducationId(), requestDto.getPassword());
            Authentication authentication = authenticationManager.authenticate(authenticationToken);
            return tokenProviderService.createToken(authentication);
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
