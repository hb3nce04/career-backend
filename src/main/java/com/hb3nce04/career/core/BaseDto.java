package com.hb3nce04.career.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Defines the basic shape of a Data Transfer Object (DTO).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseDto {
    private Integer id;
}
