package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDto extends BaseDto<Integer> {
    @NotBlank(message = "Az iskola nevének megadása kötelező.")
    private String name;
}
