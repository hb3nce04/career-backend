package com.hb3nce04.career.domain.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    @NotBlank(message = "Felhasználónév megadása kötelező!")
    private String username;
    @NotBlank(message = "Jelszó megadása kötelező!")
    private String password;
}
