package io.hb3nce04.career.backend.model.dto;

import io.hb3nce04.career.backend.model.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CareerPathCategoryDto extends BaseDto {
    private String name;
}
