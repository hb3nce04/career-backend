package com.hb3nce04.career.core.api;

import java.util.List;

/**
 * Interface for CRUD service.
 * @param <D> resource's DTO class
 * @param <ID> resource's JPA primary key type
 */
public interface CrudService <D, E, ID> {
    List<D> findAll();
    D findById(ID id);
    D create(D entity);
    D update(ID id, D entity);
    void delete(ID id);
    E toEntity(D dto);
    D toDto(E entity);
}