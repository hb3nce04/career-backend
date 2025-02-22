package com.hb3nce04.career.domain.user;

import com.hb3nce04.career.core.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto {
    @NotBlank(message = "Felhasználónév megadása kötelező.")
    private String name;

    @NotBlank(message = "Jelszó megadása kötelező.")
    private String password;

    // TODO: validate ENUMs
    //private Role role;

//    @OneToMany(mappedBy = "user")
//    private List<Class> classes;
}
