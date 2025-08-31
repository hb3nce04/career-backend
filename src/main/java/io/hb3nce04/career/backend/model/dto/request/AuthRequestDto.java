package io.hb3nce04.career.backend.model.dto.request;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequestDto {
    @NotEmpty(message = "OM azonosító megadása kötelező.")
    @Length(
            min = 11,
            max = 11,
            message = "OM azonosító hossza 11 karakter."
    )
    private String educationId;

    @NotEmpty(message = "Jelszó megadása kötelező.")
    private String password;
}
