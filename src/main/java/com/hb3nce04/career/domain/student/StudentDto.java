package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.BaseDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto extends BaseDto<Integer> {
    @NotBlank(message = "A tanuló keresztnevének megadása kötelező.")
    private String firstName;

    @NotBlank(message = "A tanuló vezetéknevének megadása kötelező.")
    private String lastName;

    @NotNull(message = "A tanuló tanrendjének megadása kötelező.")
    private Boolean dayShift;

//    @ManyToOne
//    @JoinColumn(name = "class_id")
//    private Class classId;
//
//    @ManyToOne
//    private Sector sector;
//
//    @ManyToOne
//    private Profession profession;
}
