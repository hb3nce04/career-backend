package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.BaseDto;
import com.hb3nce04.career.domain.school.SchoolDto;
import com.hb3nce04.career.domain.user.UserDto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ClassDto extends BaseDto<Integer> {
    @NotBlank(message = "Az osztály nevének megadása kötelező.")
    private String name;

    @Range(min = 2025, max = Integer.MAX_VALUE, message = "A megadott évszám helytelen.")
    private Integer finishingYear;

    private SchoolDto school;

    private UserDto user;
}