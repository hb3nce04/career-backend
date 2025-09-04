package io.hb3nce04.career.backend.model.dto;

import io.hb3nce04.career.backend.model.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CareerPathDto extends BaseDto {
    private String description;

    //private StudentDto student;

    private CareerPathCategoryDto careerPathCategory;
}
