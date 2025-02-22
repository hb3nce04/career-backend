package com.hb3nce04.career.domain.category;

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
public class CategoryDto extends BaseDto {
    @NotBlank(message = "A kategória nevének megadása kötelező.")
    private String name;
}
