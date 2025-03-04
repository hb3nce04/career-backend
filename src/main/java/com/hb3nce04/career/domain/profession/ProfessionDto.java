package com.hb3nce04.career.domain.profession;

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
public class ProfessionDto extends BaseDto<Integer> {
    @NotBlank(message = "A szakma nevének megadása kötelező.")
    private String name;

    @NotBlank(message = "A szakma számának megadása kötelező")
    private String number;

//    @OneToMany(mappedBy = "profession")
//    private List<Student> students;
}
