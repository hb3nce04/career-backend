package com.hb3nce04.career.domain.sector;

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
public class SectorDto extends BaseDto {
    @NotBlank(message = "Az ágazat nevének megadása kötelező.")
    private String name;

    @NotBlank(message = "Az ágazat számának megadása kötelező.")
    private String number;

//    @OneToMany(mappedBy = "sector")
//    private List<Student> student;
}
