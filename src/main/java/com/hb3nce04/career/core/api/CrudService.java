package com.hb3nce04.career.core.api;

import java.util.List;

/**
 * Interface for CRUD service.
 * @param <E> resource's entity class
 * @param <ID> resource's JPA primary key type
 */
public interface CrudService <E, ID> {
    List<E> findAll();
    E findById(ID id);
    E create(E entity);
    E update(ID id, E entity);
    void delete(ID id);
}