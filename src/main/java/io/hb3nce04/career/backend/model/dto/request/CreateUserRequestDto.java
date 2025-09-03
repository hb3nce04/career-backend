package io.hb3nce04.career.backend.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDto {
    @Size(min = 11, max = 11)
    @NotBlank(message = "OM azonosító megadása kötelező")
    private String educationId;

    @NotBlank(message = "Jelszó megadása kötelező")
    private String password;

    @NotNull(message = "Jogosultság megadása kötelező")
    private Boolean isAdmin;
}
