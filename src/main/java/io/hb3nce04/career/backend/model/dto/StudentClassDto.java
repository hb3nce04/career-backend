package io.hb3nce04.career.backend.model.dto;

import java.time.Year;

import io.hb3nce04.career.backend.model.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentClassDto extends BaseDto {
    private String name;

    private Year finishingYear;

    private SchoolDto school;
}
