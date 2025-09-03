package io.hb3nce04.career.backend.model.dto;

import io.hb3nce04.career.backend.model.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SectorDto extends BaseDto {
    private String name;

    private String number;
}
