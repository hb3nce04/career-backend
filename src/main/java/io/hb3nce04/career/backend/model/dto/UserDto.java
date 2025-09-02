package io.hb3nce04.career.backend.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {
    private String educationId;
    private Boolean isAdmin;
}
