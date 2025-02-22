package com.hb3nce04.career.core.api.impl;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.exception.EntityNotFoundException;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Abstract service class for resources to implement CRUD operations.
 * @param <E> resource's entity class
 * @param <ID> resource's JPA primary key type
 */
public abstract class CrudServiceImpl<E, ID> implements CrudService<E, ID> {

    private final CrudRepository<E, ID> repository;

    public CrudServiceImpl(CrudRepository<E, ID> repository) {
        this.repository = repository;
    }

    public List<E> findAll() {
        return (List<E>) repository.findAll();
    }

    public E findById(ID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public E create(E entity) {
        return repository.save(entity);
    }

    public E update(ID id, E entity) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException();
        }
        return repository.save(entity);
    }

    public void delete(ID id) { repository.deleteById(id); }
}