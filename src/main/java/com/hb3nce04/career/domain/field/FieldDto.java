package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.BaseDto;
import com.hb3nce04.career.domain.category.CategoryDto;
import com.hb3nce04.career.domain.student.StudentDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldDto extends BaseDto {
    @NotBlank(message = "A terület leírásának megadása kötelező.")
    private String description;

    private StudentDto student;

    private CategoryDto category;
}
