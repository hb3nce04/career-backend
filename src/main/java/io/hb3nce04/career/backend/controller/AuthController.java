package io.hb3nce04.career.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.model.dto.request.AuthRequestDto;
import io.hb3nce04.career.backend.model.dto.response.MessageResponseDto;
import io.hb3nce04.career.backend.service.auth.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<MessageResponseDto> login(
            @RequestBody @Validated AuthRequestDto requestDto,
            HttpServletResponse response) {
        Cookie cookie = new Cookie("token", authService.loginAndGetToken(requestDto));

        // TODO: config
        cookie.setHttpOnly(true);
        //cookie.setSecure(true);
        cookie.setPath("/api");
        cookie.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie);

        return ResponseEntity.ok(MessageResponseDto.builder().message("Sikeresen bejelentkeztél!").build());
    }

    @PostMapping("/logout")
    public ResponseEntity<MessageResponseDto> logout(HttpServletResponse response) {
        Cookie cookie = new Cookie("token", null);
        cookie.setMaxAge(0);
        cookie.setPath("/api");
        response.addCookie(cookie);

        return ResponseEntity.ok(MessageResponseDto.builder().message("Sikeresen kijelentkeztél!").build());
    }
}
