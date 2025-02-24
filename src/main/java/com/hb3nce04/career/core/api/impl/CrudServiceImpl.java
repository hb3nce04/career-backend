package com.hb3nce04.career.core.api.impl;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.Mapper;
import com.hb3nce04.career.core.exception.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Abstract service class for resources to implement CRUD operations.
 * @param <D> resource's DTO class
 * @param <E> resource's entity class
 * @param <M> resource's mapper with bounding
 * @param <ID> resource's JPA primary key type
 */
public abstract class CrudServiceImpl<D, E, M extends Mapper<D, E>, ID> implements CrudService<D, ID> {

    private final JpaRepository<E, ID> repository;

    private final M mapper;

    public CrudServiceImpl(JpaRepository<E, ID> repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private E getEntityById(ID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<D> findAll() {
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }

    public D findById(ID id) {
        return mapper.toDTO(getEntityById(id));
    }

    public D create(D dto) {
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    public D update(ID id, D dto) {
        E entity = getEntityById(id);
        E updated = mapper.updateEntity(entity, dto);
        return mapper.toDTO(repository.save(updated));
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }
}