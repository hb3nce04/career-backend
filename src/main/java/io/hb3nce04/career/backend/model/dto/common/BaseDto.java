package io.hb3nce04.career.backend.model.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
}
