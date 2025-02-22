package com.hb3nce04.career.core.api;

/**
 * Interface for mapping between entity and DTO classes.
 * @param <D> resource's DTO class
 * @param <E> resource's entity class
 */
public interface Mapper<D, E> {
    E toEntity(D dto);
    D toDTO(E entity);
}
