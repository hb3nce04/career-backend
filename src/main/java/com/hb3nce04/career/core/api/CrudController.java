package com.hb3nce04.career.core.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Interface for CRUD controller.
 * @param <D> resource's DTO class
 * @param <ID> resource's JPA primary key type
 */
public interface CrudController<D, ID> {
    ResponseEntity<List<D>> findAll();
    ResponseEntity<D> findById(ID id);
    ResponseEntity<D> create(D dto);
    ResponseEntity<D> update(ID id, D dto);
    ResponseEntity<D> delete(ID id);
}