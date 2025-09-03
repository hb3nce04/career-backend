package io.hb3nce04.career.backend.model.dto;

import java.util.List;

import io.hb3nce04.career.backend.model.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto extends BaseDto {
    private String firstName;

    private String lastName;

    private Boolean isDayShift;

    private StudentClassDto studentClass;

    private ProfessionDto profession;

    private SectorDto sector;

    private List<CareerPathDto> careerPaths;
}
