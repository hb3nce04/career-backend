package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class TestDto extends BaseDto {
    private String name;
    private Integer number;
}
