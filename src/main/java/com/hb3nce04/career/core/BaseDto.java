package com.hb3nce04.career.core;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class BaseDto<T> {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private T id;
}
