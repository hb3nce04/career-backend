package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class TestEntity extends BaseEntity<Integer> {
    @NotBlank
    private String name;
    @NotBlank
    private Integer number;
}
