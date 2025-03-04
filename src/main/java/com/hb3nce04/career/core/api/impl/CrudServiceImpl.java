package com.hb3nce04.career.core.api.impl;

import com.hb3nce04.career.core.BaseDto;
import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.exception.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Abstract service class for resources to implement CRUD operations.
 * @param <D> resource's DTO class
 * @param <E> resource's entity class
 * @param <ID> resource's JPA primary key type
 */
public abstract class CrudServiceImpl<D extends BaseDto<ID>, E extends BaseEntity<ID>, ID> implements CrudService<D, E, ID> {

    private final JpaRepository<E, ID> repository;

    private final ModelMapper mapper;
    private final Class<D> dtoClass;
    private final Class<E> entityClass;

    public CrudServiceImpl(JpaRepository<E, ID> repository, ModelMapper mapper, Class<D> dtoClass, Class<E> entityClass) {
        this.repository = repository;
        this.mapper = mapper;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    private E getEntityById(ID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<D> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    public D findById(ID id) {
        return this.toDto(getEntityById(id));
    }

    public D create(D dto) {
        E entity = this.toEntity(dto);
        repository.save(entity);
        return this.toDto(entity);
    }

    public D update(ID id, D dto) {
        E entity = getEntityById(id);
        mapper.map(dto, entity);
        entity.setId(id); // ?
        E saved = repository.save(entity);
        return this.toDto(saved);
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

    public D toDto(E entity) {
        return mapper.map(entity, dtoClass);
    }

    public E toEntity(D dto) {
        return mapper.map(dto, entityClass);
    }
}