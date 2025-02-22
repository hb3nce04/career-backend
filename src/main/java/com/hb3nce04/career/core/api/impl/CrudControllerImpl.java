package com.hb3nce04.career.core.api.impl;

import com.hb3nce04.career.core.api.CrudController;
import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.Mapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Abstract controller class for resources to implement CRUD operations.
 * @param <D> resource's DTO class
 * @param <E> resource's entity class
 * @param <M> resource's mapper class
 * @param <ID> resource's JPA primary key type
 */
public abstract class CrudControllerImpl<D, E, M extends Mapper<D,E>, ID> implements CrudController<D, ID> {
    private final CrudService<E, ID> service;
    private final M mapper;

    public CrudControllerImpl(CrudService<E, ID> service, M mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return new ResponseEntity<>(service.findAll().stream().map(mapper::toDTO).toList(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable("id") ID id) {
        return new ResponseEntity<>(mapper.toDTO(service.findById(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody @Valid D dto) {
        return new ResponseEntity<>(mapper.toDTO(service.create(mapper.toEntity(dto))), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable("id") ID id, @RequestBody @Valid D dto) {
        return new ResponseEntity<>(mapper.toDTO(service.update(id, mapper.toEntity(dto))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<D> delete(@PathVariable("id") ID id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
